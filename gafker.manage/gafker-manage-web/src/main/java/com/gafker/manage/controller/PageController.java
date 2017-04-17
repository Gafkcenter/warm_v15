package com.gafker.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/")
public class PageController {
	
	@RequestMapping("{name}")
	public String getPage(@PathVariable String name){
		return name;
	}

	@RequestMapping("{prefix}/{name}")
	public String getPrefixPage(@PathVariable String prefix,@PathVariable String name){
		return prefix+"/"+name;
	}
	@RequestMapping("{pprefix}/{prefix}/{name}")
	public String getDoublePrefixPage(@PathVariable String pprefix,@PathVariable String prefix,@PathVariable String name){
		return pprefix+"/"+prefix+"/"+name;
	}
}
