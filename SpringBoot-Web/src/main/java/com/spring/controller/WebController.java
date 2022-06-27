package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author master
 * @version 1.0
 * @date 2022/6/27 21:14
 **/
@RestController
public class WebController {

    @GetMapping("/web/test")
    public String getMessage(){

        return "SpringBoot-Test is running......";
    }
}
