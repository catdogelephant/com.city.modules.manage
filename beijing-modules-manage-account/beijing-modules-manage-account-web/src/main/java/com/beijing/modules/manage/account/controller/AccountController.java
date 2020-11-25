package com.beijing.modules.manage.account.controller;


import com.beijing.modules.manage.account.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * account 前端控制器
 * </p>
 *
 * @author sx
 * @since 2020-11-19
 */
@Validated
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService iAccountService;

    @PostMapping(name = "测试map映射", path = "/testMapVo.json")
    public Object testMapVo(){
        return iAccountService.testMapVo();
    }

}
