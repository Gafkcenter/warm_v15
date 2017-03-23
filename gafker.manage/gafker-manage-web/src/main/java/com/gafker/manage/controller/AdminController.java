package com.gafker.manage.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理
 * @author gafker
 *
 */
@Controller
@RequestMapping(value="/admin/")
public class AdminController {
	public static Logger logger1 = LogManager.getLogger(AdminController.class);
	
	// 登录成功的页面
    @RequestMapping(value = "home")
    public String adminHomePage(){
        return "admin/home";
    }

    // 只有角色为admin的才能访问
    @RequiresRoles("admin")
    @RequestMapping(value = "role")
    public String adminWithRole(){
        return "admin/withrole";
    }

    // 只用同时具有user:view和user:create权限才能访问
    @RequiresPermissions(value={"user:view","user:create"}, logical= Logical.AND)
    @RequestMapping(value = "auth")
    public String adminWithAuth(){
        return "admin/withauth";
    }
}
