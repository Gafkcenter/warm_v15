package com.gafker.manage.controller;

import com.gafker.manage.pojo.TimesTable;
import com.gafker.manage.pojo.TimesTableExample;
import com.gafker.manage.service.TimesTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by gafker on 2017/8/6.
 */
@Controller
@RequestMapping("time")
public class TimesTableController {
    @Autowired
    TimesTableService timesTableService;
    @RequestMapping("list")
    public String list(Model model , HttpServletRequest request, HttpServletResponse response, TimeZone timeZone, Locale locale){
        TimesTableExample example = new TimesTableExample();
        List<TimesTable> timeList = null;
        try {
           timeList = timesTableService.selectList(example);
        } catch (Exception e) {
        }
        model.addAttribute("list",timeList);
        return "time/list";

    }

}
