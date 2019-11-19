package com.datou.demo.dao;

import com.datou.demo.model.domain.UserInfoDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapper {
    /**
     * 查询用户
     * @param name
     * @param pwd
     * @return
     */
    UserInfoDO getUserInfo(@Param("name") String name,@Param("pwd") String pwd);
}
