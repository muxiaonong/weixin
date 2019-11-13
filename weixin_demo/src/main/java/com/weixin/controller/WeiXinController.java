package com.weixin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: weixin_demo
 * @ClassName WeiXinController
 * @description:
 * @author: lyy
 * @create: 2019-11-12 10:16
 * @Version 1.0
 **/
@RestController
@RequestMapping("weixin")
public class WeiXinController {


    @GetMapping("test")
    public String auth(@RequestParam("code") String code){
        System.out.println(code);
        return code;
    }
}