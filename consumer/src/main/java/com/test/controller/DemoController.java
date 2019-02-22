package com.test.controller;

import com.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("demo")
@Controller
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping("test")
    @ResponseBody
    public String test(int a, int b) {
        return "" + demoService.add(a, b);
    }

}
