package com.service;


import com.domain.ResponseResult;
import com.domain.User;

/**
 * @time 2023-06-07 09:58:55
 */
public interface LoginService {

    ResponseResult<?> login(User user);

    ResponseResult<?> logout();
}
