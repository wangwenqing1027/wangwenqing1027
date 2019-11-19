package com.datou.demo.model.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfoDO {
    /**
     * 主键
     */
    Integer id;
    /**
     * 用户名
     */
    String name;
    /**
     * 密码
     */
    String pwd;
    /**
     * 创建时间
     */
    Date createTime;
}
