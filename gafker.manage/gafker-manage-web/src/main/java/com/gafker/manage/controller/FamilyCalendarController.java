package com.gafker.manage.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.manage.entity.FamilycalendarQuery;
import com.gafker.manage.entity.Page;
import com.gafker.manage.pojo.FamilycalendarForm;
import com.gafker.manage.service.FamilyCalendarService;

@Controller
@RequestMapping("ca")
public class FamilyCalendarController implements BaseV2Controller<FamilycalendarForm, FamilycalendarQuery, String> {
	@Autowired
	FamilyCalendarService familycalendarService;

	@Override
	@RequestMapping(value = "s", method = RequestMethod.POST)
	public String insert(@Valid FamilycalendarForm data, BindingResult b, Model m) throws Exception {
		if (b.hasErrors()) {
			m.addAttribute("data", data);
			return "calendar/calendarForm";
		}
		familycalendarService.save(data);
		return "redirect:/ca/l";
	}

	@Override
	@RequestMapping(value = "q/{id}", method = RequestMethod.GET)
	public String selectByPrimaryKey(@PathVariable Long id, Model m) throws Exception {
		FamilycalendarForm data = familycalendarService.findByPrimaryId(id);
		m.addAttribute("data", data);
		return "calendar/details";
	}

	@Override
	@RequestMapping(value = "{pageStart}/q/{pageSize}", method = RequestMethod.POST)
	public String selectByCondition(FamilycalendarQuery con, Page<?> p, Model m) throws Exception {
		List<FamilycalendarForm> dataVo = familycalendarService.selectByExample(con, p);
		m.addAttribute("data", dataVo);
		return "calendar/data";
	}

	@Override
	@RequestMapping(value = "l", method = RequestMethod.GET)
	public String selectByAll(@Valid Page<?> p, Model m) throws Exception {
		List<FamilycalendarForm> dataVo = familycalendarService.selectAll(p);
		m.addAttribute("data", dataVo);
		return  "calendar/data";
	}
	

	@Override
	@RequestMapping(value = "u/{id}", method = RequestMethod.GET)
	public String update(@PathVariable Long id, Model m) throws Exception {
		FamilycalendarForm data = familycalendarService.findByPrimaryId(id);
		if(data ==null){
			m.addAttribute("data", data);
			return "calendar/calendarForm";
		}
		m.addAttribute("data", data);
		return "calendar/calendarForm";
	}

	@Override
	@RequestMapping(value = "u", method = RequestMethod.POST)
	public String update(@Valid FamilycalendarForm data, BindingResult b, Model m) throws Exception {
		if (b.hasErrors()) {
			m.addAttribute("data", data);
			return "calendar/calendarForm";
		}
		familycalendarService.update(data);
		return "redirect:/ca/l";
	}

	@Override
	@RequestMapping(value = "d/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model m) throws Exception {
		int result = familycalendarService.delete(id);
		m.addAttribute("data", result);
		return "redirect:/ca/l";
	}

	@Override
	@RequestMapping(value = "/page/{view}", method = RequestMethod.GET)
	public String page(@PathVariable String view, FamilycalendarForm data, Model m) {
		view = view.replaceAll(":", "/");
		m.addAttribute("data", data);
		return view;
	}
}
