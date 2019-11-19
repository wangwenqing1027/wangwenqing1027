package com.datou.demo.control;

import com.datou.demo.model.LoginResultModel;
import com.datou.demo.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 登录页面的control层
 * 访问路径：http://localhost:8080/datou/login
 * 知识点：①control的注解待办这是个可以对外被访问 ②requestMapping待办的是路径  ③requestbody是代表返回的内容格式
 */

@Controller
@RequestMapping("/datou")
public class LoginController {
    @Resource
    LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestParam(name = "name",required = false)String name, @RequestParam(name="password",required = false) String password) {
        LoginResultModel loginResultModel = loginService.login(name, password);

        return loginResultModel;
    }

}
