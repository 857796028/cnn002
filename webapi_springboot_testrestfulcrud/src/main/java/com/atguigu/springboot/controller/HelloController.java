package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zgc on 11 : 2018/11/14 0014 : 上午 9:29
 */
@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "HELLO WORLD !";
    }

}
