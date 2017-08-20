package com.gafker.manage.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="pay")
public class PayController {
	
	private static final Logger LOGGER = LogManager.getLogger(PayController.class);
	
	@RequestMapping(value="payIndex",method=RequestMethod.GET)
	public String toPayIndex(Model m){
		return "pay/payIndex";
	}
	
	@RequestMapping(value="payForm",method=RequestMethod.GET)
	public String toPayForm(Model m){
		return "pay/payForm";
	}
	/**
	 * http://www.gafker.com/pay/payssion/notify
	 * http://www.gafker.com/pay/payment/back
	 */
	@RequestMapping(value="payssion/notify",method=RequestMethod.POST)
	public String toPayNotify(Model m){
		return "pay/payNotify";
	}
	@RequestMapping(value="payment/back",method=RequestMethod.GET)
	public String toPayBack(Model m){
		return "pay/payBack";
	}

}
