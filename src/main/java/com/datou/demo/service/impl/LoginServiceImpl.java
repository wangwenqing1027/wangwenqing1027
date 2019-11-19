package com.datou.demo.service.impl;

import com.datou.demo.dao.UserInfoMapper;
import com.datou.demo.model.LoginResultModel;
import com.datou.demo.model.domain.UserInfoDO;
import com.datou.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * login这个方法的具体实现
 * 这里也可以用comand+N去自动生成实现类
 * override表示这是个重载的方法。。。。
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public LoginResultModel login(String name, String password) {
        LoginResultModel loginResultModel = new LoginResultModel();

        UserInfoDO userInfo = userInfoMapper.getUserInfo(name, password);

        System.out.println(userInfo);

        //①equal表示值相同，==表示值和地址都相同，string类型会新建一个地址所以不一样   ②判断语句为了防止空指针，需要把确定的值放前面
        if(userInfo != null && userInfo.getName().equals(name) && userInfo.getPwd().equals(password)){
            loginResultModel.setSuccess(true);
        }else {
            loginResultModel.setSuccess(false);
            loginResultModel.setFailReason("账号密码错误");
        }
        return loginResultModel;
    }
}
