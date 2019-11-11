package com.datou.demo.service;

import com.datou.demo.model.LoginResultModel;

/**
 * 登录页面的service（service层会有多种实现，所以在service定义一个借口，各种实现）
 * Interface里面的方法默认都是public
 */
public interface LoginService {
    /**
     * 登录
     * @param name
     * @param password
     * @return
     */
    LoginResultModel login(String name,String password);

}
