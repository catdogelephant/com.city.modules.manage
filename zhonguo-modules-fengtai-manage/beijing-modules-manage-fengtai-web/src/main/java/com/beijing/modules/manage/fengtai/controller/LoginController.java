package com.beijing.modules.manage.fengtai.controller;

import com.beijing.modules.manage.fengtai.service.impl.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/city/fengtai")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(name = "登录测试", path = "/loginTest.json")
    public Object loginTest(){
        loginService.loginTest();
        System.out.println(1/0);
        return true;
    }
}
