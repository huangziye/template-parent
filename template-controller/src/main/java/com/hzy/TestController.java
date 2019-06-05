package com.hzy;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ziye_huang
 * @date: 2019/6/5
 */

@RestController
@RequestMapping("/test/user")
public class TestController {

    @PostMapping("/login.json")
    public String login(String username, String password) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) return "用户名或密码不能为空";
        return username.equalsIgnoreCase("hzy") && password.equalsIgnoreCase("123456") ? "登录成功" : "登录失败";
    }

}
