package com.it.guigu;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zgc on 11 : 2018/11/10 0010 : 下午 2:31
 */
@Controller
//@ResponseBody Customer{name='hanxue', age='20', sex='null', tel='135'}
public class WebApiSpringBootController
{
    @RequestMapping(value = "/api")
    public String hello(   ){
        Customer customer = new Customer();
        customer.setAge("20");
        customer.setName("hanxue");
        customer.setTel("135");
        System.out.println(System.currentTimeMillis());
        return System.currentTimeMillis()+"HELLO"+customer; //Customer{name='hanxue', age='20', sex='null', tel='135'}
    }

}
