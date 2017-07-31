package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2016-10-30 23:36
 */
@RestController
@RequestMapping("/hello")
public class HelloController1 {


    @RequestMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        return "id1: " + myId;
//        return girlProperties.getCupSize();
    }
}