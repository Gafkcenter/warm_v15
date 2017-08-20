package com.gafker.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.common.utils.RequestResponseUtils;
import com.gafker.manage.entity.Feedback;
import com.gafker.manage.service.FeedBackService;

@Controller
@RequestMapping("feedback")
public class FeedBackController {
	private static Logger logger1 = LogManager.getLogger(FeedBackController.class);

	@Autowired
	private FeedBackService feedBackService;
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	/**
	 * 跳转到反馈
	 * @param req
	 * @param res
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "indexform", method = RequestMethod.GET)
	public String toFeedBack(HttpServletRequest req, HttpServletResponse res) {
		return "feedback";
	}
	/**
	 * 意见建议与反馈用户信息
	 * @param req
	 * @param res
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String saveInfo(HttpServletRequest req, HttpServletResponse res, @Valid Feedback record,Errors errors,Model model) throws Exception{
		if(errors.hasErrors()){
			 List<ObjectError> allErrors = errors.getAllErrors();
			 for(ObjectError error:allErrors){
				 if(error.getObjectName()=="content"){
					 model.addAttribute("message",error.getDefaultMessage());
				 }
			 }
			model.addAttribute("feedback", record);
			return "feedback";
		}
		record.setUseragent(req.getHeader("User-Agent"));
		record.setIpaddress(RequestResponseUtils.getIp2(req));
		feedBackService.saveInfo(record);
		model.addAttribute("feedback", "<h1><b>意见反馈成功。</b></h1>谢谢");
		return "redirect:/t/l";
	}
	
	/**
	 * 按ID反馈给用户
	 * @param req
	 * @param res
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateInfo(HttpServletRequest req, HttpServletResponse res, Feedback record) {
		feedBackService.updateInfo(record);
		return "redirect:/t/l";
	}
}
