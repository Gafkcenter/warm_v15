package com.gafker.manage.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gafker.manage.pojo.PhonesevenForm;
import com.gafker.manage.service.PhonesevenService;

@Controller
@RequestMapping(value = "seven")
public class PhoneSevenController {
	@Autowired
	PhonesevenService phonesevenService;

	/**
	 * 1.检查open的prefix是否生成了phoneseven表中生成PhoneSeven
	 * 2.如果有open的prefix没有生成PhoneSeven则将其生成到phoneseven表中
	 * @param m
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "seven")
	public String generatePhoneSeven(Model m) throws Exception {
		int result = phonesevenService.generateAndCheckPhoneSeven();
		m.addAttribute("message", "完成！");
		if (result < 0)
			m.addAttribute("message", "失败！");
		return "success";
	}
	
	/**
	 * 1.检查生成的PhoneSeven是否已经设置对应归属地
	 * 2.如何没有设置归属地则通过第三方restApi设置归属地
	 * @param m
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "checkgeo/{p}")
	public void getPhoneSevenGeoCheck(@PathVariable Integer p) throws Exception {
		int result=0;
		for(int i=1;i<=10;i++){
		result	= phonesevenService.updateGeoPhoneSeven(p+i,100);
		}
		if(result>0){
			this.getPhoneSevenGeoCheck(p);
		}
		
	}
	@RequestMapping(value = "vcf")
	public String getVcfCheck(Model m) throws Exception {
		int result = phonesevenService.saveVcfPhoneSeven("gf_", null);
		m.addAttribute("message", "完成！"+new Date());
		if (result<0)
			m.addAttribute("message", "失败！"+new Date());
		return "success";
	}
}
