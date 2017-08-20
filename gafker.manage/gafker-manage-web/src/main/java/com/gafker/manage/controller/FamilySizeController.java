package com.gafker.manage.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.manage.entity.FamilysizeExample;
import com.gafker.manage.entity.FamilysizeExample.Criteria;
import com.gafker.manage.pojo.FamilysizeForm;
import com.gafker.manage.service.FamilySizeService;

@Controller
@RequestMapping("size")
public class FamilySizeController {
	private Map<String,String> errorMap=new HashMap<>();
	@Autowired
	FamilySizeService familySizeService;

	@RequestMapping(value = "s", method = RequestMethod.GET)
	public String savefamilySize(Model m) {
		m.addAttribute("sizeInfo", new FamilysizeForm());
		return "size/sizeCreate";
	}

	@RequestMapping(value = "s", method = RequestMethod.POST)
	public String savefamilySize(@Valid FamilysizeForm sizeInfo, BindingResult b, Model m) throws Exception {
		if (b.hasErrors()) {
			List<FieldError> errors = b.getFieldErrors();
			FieldError error=null;
			for(int i=0;i<errors.size();i++){
				error=errors.get(i);
				errorMap.put(error.getField(),error.getDefaultMessage());
			}
			m.addAttribute("errorMap", errorMap);
			m.addAttribute("sizeInfo", sizeInfo);
			return "size/sizeCreate";
		}
		int result = familySizeService.save(sizeInfo);
		if (result <= 0) {
			throw new RuntimeException(this.getClass() + ":保存失败！");
		}
		return "redirect:/size/l";
	}

	@RequestMapping(value = "u/{id}", method = RequestMethod.GET)
	public String findByPrimaryId(@PathVariable Long id, Model m) throws Exception {
		FamilysizeForm result = familySizeService.findByPrimaryId(id);
		if (result == null) {
			throw new RuntimeException(this.getClass() + ":查询失败！");
		}
		m.addAttribute("sizeInfo", result);
		return "size/sizeEdit";
	}

	@RequestMapping(value = "u", method = RequestMethod.POST)
	public String updatefamilySize(@Valid FamilysizeForm sizeInfo, BindingResult b, Model m) throws Exception {
		if (b.hasErrors()) {
			List<FieldError> errors = b.getFieldErrors();
			FieldError error=null;
			for(int i=0;i<errors.size();i++){
				error=errors.get(i);
				errorMap.put(error.getField(),error.getDefaultMessage());
			}
			m.addAttribute("errorMap", errorMap);
			m.addAttribute("sizeInfo", sizeInfo);
			return "size/sizeEdit";
		}
		int result = familySizeService.update(sizeInfo);
		if (result <= 0) {
			throw new RuntimeException(this.getClass() + ":更新失败！");
		}
		return "redirect:/size/l";
	}

	@RequestMapping(value = "u/{id}/{status}/status", method = RequestMethod.GET)
	public String updatefamilySizeStatus(@PathVariable Long id, @PathVariable int status, Model m) throws Exception {
		FamilysizeForm sizeInfo = new FamilysizeForm();
		sizeInfo.setId(id);
		sizeInfo.setStatus(status == 0 ? 1 : 0);
		int result = familySizeService.updateSelect(sizeInfo);
		if (result <= 0) {
			throw new RuntimeException(this.getClass() + ":更新状态失败！");
		}
		return "redirect:/size/l";
	}
	@RequestMapping(value = "{userId}", method = RequestMethod.GET)
	public String updatefamilySizeStatus(@PathVariable String userId, Model m) throws Exception {
		userId = userId!=null?userId:"0";
		FamilysizeForm sizeInfo = new FamilysizeForm();
		sizeInfo.setCreateby(userId);
		FamilysizeExample c=new FamilysizeExample();
		Criteria cr = c.createCriteria();
		cr.andCreatebyEqualTo(userId);
		List<FamilysizeForm> sizeList = familySizeService.selectByExample(c);
		m.addAttribute("sizeList", sizeList);
		return "redirect:/size/l";
	}

	@RequestMapping(value = "d/{id}", method = RequestMethod.GET)
	public String deleteByPrimaryId(@PathVariable Long id, Model m) throws Exception {
		int result = familySizeService.delete(id);
		if (result <= 0) {
			throw new RuntimeException(this.getClass() + ":更新失败！");
		}
		return "redirect:/size/l";
	}

	@RequestMapping(value = "q/l", method = RequestMethod.POST)
	public String selectAll(@Valid FamilysizeForm s, Model m) throws Exception {
		FamilysizeExample c = new FamilysizeExample();
		Criteria cr = c.createCriteria();
		cr.andNamecnNotEqualTo(s.getNamecn());
		List<FamilysizeForm> dataList = familySizeService.selectByExample(c);
		m.addAttribute("sizeList", dataList);
		return "size/dataForm";
	}

	@RequestMapping(value = "l", method = RequestMethod.GET)
	public String selectAll(Model m) throws Exception {
		List<FamilysizeForm> dataList = familySizeService.selectAll();
		m.addAttribute("sizeList", dataList);
		return "size/sizeList";
	}
}
