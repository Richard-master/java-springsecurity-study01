package com.controller;

import com.domain.ResponseResult;
import com.domain.User;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname
 * @Description
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginServcie;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        return loginServcie.login(user);
    }


    @GetMapping("/user/logout")
    public ResponseResult logout(){
        return loginServcie.logout();
    }
}