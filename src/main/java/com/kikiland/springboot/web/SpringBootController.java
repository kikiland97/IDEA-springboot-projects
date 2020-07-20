package com.kikiland.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 王雅琦
 * 2020/07/18
 */
@Controller
public class SpringBootController {

    @RequestMapping("/hello")
    public @ResponseBody
    Object hello() {
        return "Hello World";
    }

}
