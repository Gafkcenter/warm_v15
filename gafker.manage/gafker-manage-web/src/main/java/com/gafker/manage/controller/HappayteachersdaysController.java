package com.gafker.manage.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gafker.manage.pojo.Happayteachersdays;
import com.gafker.manage.pojo.HappayteachersdaysExample;
import com.gafker.manage.pojo.HappayteachersdaysExample.Criteria;
import com.gafker.manage.pojo.RecordStatus;
import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.pojo.request.HappayteachersdaysRequest;
import com.gafker.manage.service.HappayteachersdayService;
import com.gafker.manage.service.UserAttributeService;
import com.gafker.manage.service.VisitorcountService;
import com.gafker.manage.service.utils.CookiesUtil;

@Controller
@RequestMapping("t")
public class HappayteachersdaysController {

	private static Logger LOGGER = LogManager.getLogger(HappayteachersdaysController.class);

	@Autowired
	HappayteachersdayService happayteachersdaysService;

	@Autowired
	UserAttributeService userAttributeService;

	@Autowired
	VisitorcountService visitorcountService;

	@Value("${qrcode.file.show.prefix}")
	private String qrcodePathPrefix;

	/**
	 * 记录祝福信息
	 * 
	 * @param req
	 * @param res
	 * @param record
	 * @throws Exception
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveInfo(@Valid @ModelAttribute HappayteachersdaysRequest sendwishes, BindingResult result,
			HttpServletRequest req, HttpServletResponse res, Model m) throws Exception {
		if (result.hasErrors()) {
			m.addAttribute("sendwishes", sendwishes);
			return "data";
		}
		//注册没有注册的用户
		regUnRegUser(sendwishes, result, req, res, m);
		happayteachersdaysService.saveInfo(sendwishes, req, res, null);
		return "redirect:/t/l";
	}

	private void regUnRegUser(HappayteachersdaysRequest sendwishes, BindingResult result, HttpServletRequest req,
			HttpServletResponse res, Model m) throws Exception {
		HappayteachersdaysRequest data=new HappayteachersdaysRequest();
		data.setTeachers(sendwishes.getTeachers());
		data.setStudents(sendwishes.getStudents());
		this.registerUserAjax(data, result, req, res, m);
	}

	/**
	 * 更新点赞
	 * 
	 * @param req
	 * @param res
	 * @param record
	 * @param id
	 * @throws Exception
	 */
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateInfo(HttpServletRequest req, HttpServletResponse res, HappayteachersdaysRequest record,
			@PathVariable("id") Long id) throws Exception {
		record.setId(id);
		happayteachersdaysService.updateInfo(record);
		return "redirect:/t/l";
	}

	/**
	 * 查祝福all {notUse}
	 * 
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "listtop", method = RequestMethod.GET)
	public String listTop20(HttpServletRequest req, HttpServletResponse res, Model mv) {
		try {
			List<Happayteachersdays> data = happayteachersdaysService.listTop20();
			mv.addAttribute("wishes", data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "data";
	}

	/**
	 * 查祝福allByPage
	 * 
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "listpage", method = RequestMethod.GET)
	public @ResponseBody List<Happayteachersdays> listBypae(HttpServletRequest req, HttpServletResponse res) {
		List<Happayteachersdays> data = new ArrayList<Happayteachersdays>();
		String coun = req.getParameter("coun");
		int pageStart = coun != null ? Integer.parseInt(coun) : 0;
		try {
			Page page = new Page();
			page.setPageStart(pageStart);
			data = happayteachersdaysService.listPage(page);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	@RequestMapping(value = "l", method = RequestMethod.GET)
	@Cacheable(value = "warmList", key = "all_warmList_list")
	public String listTop20Example(HttpServletRequest req, HttpServletResponse res, Model model,
			HappayteachersdaysExample example) throws Exception {
		List<Happayteachersdays> data = null;
		Userattribute user = (Userattribute) req.getSession().getAttribute("user");
		Long userId = 0l;
		if (null != user) {
			Long id = user.getId();
			userId = id == null ? 0l : id;
		}
		if (userId > 0) {
			this.exampleStudentCondition(example, userId);
			user = userAttributeService.selectByPrimaryKey(userId);
			data = listTop20ExampleByUserId(req, res, userId, example);
		} else {
			example.setOrderByClause("Id DESC");
			HappayteachersdaysRequest recordRequest = new HappayteachersdaysRequest();
			data = happayteachersdaysService.listTop20Example(userId, example, recordRequest);
		}
		model.addAttribute("vCount", visitorcountService.getVisitorCount());
		model.addAttribute("vCount", visitorcountService.getVisitorCount());
		model.addAttribute("user", user);
		model.addAttribute("wishes", data);
		model.addAttribute("feedback", req.getParameter("feedback"));
		model.addAttribute("sendwishes", new HappayteachersdaysRequest());
		return "data";
	}

	/**
	 * sub method
	 * 
	 * @param req
	 * @param res
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private String getUserIdFromCookies(HttpServletRequest req, String key) throws UnsupportedEncodingException {
		Cookie[] cookies = req.getCookies();
		if (req.getCookies().length > 0) {
			for (Cookie cookie : cookies) {
				if (key.equals(cookie.getName()) && cookie.getValue() != null && cookie.getValue().length() > 0) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	@RequestMapping(value = "l/{userId}/{warmId}", method = RequestMethod.GET)
	public String listTop20ExampleById(HttpServletRequest req, HttpServletResponse res, Model model,
			HappayteachersdaysExample example, @PathVariable("userId") Long userId, @PathVariable("warmId") Long warmId)
			throws Exception {
		this.exampleKeyCondition(example, warmId);
		HappayteachersdaysRequest recordRequest = new HappayteachersdaysRequest();
		recordRequest.setUser(userId);
		try {
			List<Happayteachersdays> data = happayteachersdaysService.listTop20Example(warmId, example, recordRequest);
			model.addAttribute("wishes", data);
			model.addAttribute("sendwishes", new HappayteachersdaysRequest());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 统计分享次数
		if (userId > 0) {
			Userattribute user = userAttributeService.selectByPrimaryKey(userId);
			Userattribute userupdate = new Userattribute();
			userupdate.setId(userId);
			userupdate.setPointcount(user.getPointcount() == null ? 1 : user.getPointcount() + 1);
			userupdate.setUpdatetime(new Date());
			userAttributeService.updateUserShareTimes(userupdate);
		}
		model.addAttribute("feedback", req.getParameter("feedback"));
		return "data";
	}

	private void exampleKeyCondition(HappayteachersdaysExample example, Long id) {
		example.createCriteria().andIdEqualTo(id).andIsshowEqualTo(RecordStatus.Show.getValue());
		example.setOrderByClause("Id DESC");
	}

	private void exampleStudentCondition(HappayteachersdaysExample example, Long id) {
		Criteria criteria = example.createCriteria();
		criteria.andStudentsEqualTo(String.valueOf(id));
		criteria.andIsshowEqualTo(RecordStatus.Show.getValue());
		example.setOrderByClause("Id DESC");
	}

	/**
	 * 登录用户首页
	 * 
	 * @param req
	 * @param res
	 * @param model
	 * @param record
	 * @param id
	 * @param example
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "l/{userId}/user", method = RequestMethod.GET)
	public String listTop20ExampleByUserId(HttpServletRequest req, HttpServletResponse res, Model model,
			HappayteachersdaysExample record, @PathVariable("userId") Long id, HappayteachersdaysExample example)
			throws Exception {
		Userattribute user = userAttributeService.selectByPrimaryKey(id);
		if (req.getCookies() == null && user != null) {
			CookiesUtil.setCookies(user.getUsername(), req, res, id.toString());
		}
		this.exampleStudentCondition(example, id);
		HappayteachersdaysRequest recordRequest = new HappayteachersdaysRequest();
		try {
			List<Happayteachersdays> data = happayteachersdaysService.listTop20Example(id, example, recordRequest);
			CookiesUtil.setCookies(user.getUsername(), req, res, user.getId().toString());
			model.addAttribute("user", user);
			model.addAttribute("wishes", data);
			model.addAttribute("sendwishes", new HappayteachersdaysRequest());
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("feedback", req.getParameter("feedback"));
		return "data";
	}
	
	public void registerUserAjax(HappayteachersdaysRequest data, BindingResult b, HttpServletRequest req,
			HttpServletResponse res, Model model) throws Exception {
		String teacher = new String(data.getTeachers().getBytes("ISO8859-1"),"UTF-8") ;
		String student = new String(data.getStudents().getBytes("ISO8859-1"),"UTF-8");
		if (teacher != null) {
			Userattribute userattribute = new Userattribute();
			userattribute.setUsername(data.getTeachers());
			Userattribute userInfo = userAttributeService.findByCondition(userattribute);
			if (userInfo == null) {
				MultipartFile files = null;
				userAttributeService.saveInfo(userattribute, req, res, files);
			}
		}
		
		if (student != null) {
			Userattribute userattribute = new Userattribute();
			userattribute.setUsername(data.getStudents());
			Userattribute userInfo = userAttributeService.findByCondition(userattribute);
			int result=0;
			if (userInfo == null) {
				//注册
				MultipartFile files = null;
				result = userAttributeService.saveInfo(userattribute, req, res, files);
			}
			if(result>0){
				userAttributeService.updateByPrimaryKey(userattribute);
			}
		}
	}

	public List<Happayteachersdays> listTop20ExampleByUserId(HttpServletRequest req, HttpServletResponse res, Long id,
			HappayteachersdaysExample example) throws UnsupportedEncodingException {
		HappayteachersdaysRequest recordRequest = new HappayteachersdaysRequest();
		List<Happayteachersdays> data = null;
		try {
			data = happayteachersdaysService.listTop20Example(id, example, recordRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
