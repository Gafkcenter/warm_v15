package com.gafker.manage.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.manage.pojo.PhoneprefixForm;
import com.gafker.manage.service.PhoneprefixService;

@Controller
@RequestMapping("phone")
public class PhoneprefixController {
	@Autowired
	PhoneprefixService phoneprefixService;

	@RequestMapping(value = "status/{status}/{id}")
	public String updateStatus(PhoneprefixForm data, @PathVariable String status, @PathVariable long id, Model m)
			throws Exception {
		if (id > 0) {
			data.setId(id);
			data.setStatus(status);
			int result = phoneprefixService.updateSelect(data);
			if (result > 0)
				m.addAttribute("message", true);
			m.addAttribute("message", false);
		} else {
			m.addAttribute("message", false);
		}
		return "success";

	}
	@RequestMapping(value = "finished/{finished}/{id}")
	public String updateFinished(PhoneprefixForm data, @PathVariable String finished, @PathVariable long id, Model m)
			throws Exception {
		if (id > 0) {
			data.setId(id);
			data.setStatus(finished);
			int result = phoneprefixService.updateSelect(data);
			if (result > 0)
				m.addAttribute("message", true);
			m.addAttribute("message", false);
		} else {
			m.addAttribute("message", false);
		}
		return "success";
		
	}
	@RequestMapping(value = "s",method=RequestMethod.POST)
	public String save(@Valid PhoneprefixForm data, BindingResult b,Model m)
			throws Exception {
		if(b.hasErrors()){
			m.addAttribute("message", "数据不合法！");
			return "success";
		}
		int result = phoneprefixService.save(data);
		if(result>0){
			m.addAttribute("message", true);
		}else{
			m.addAttribute("message", false);
		}
		return "success";
	}
}
