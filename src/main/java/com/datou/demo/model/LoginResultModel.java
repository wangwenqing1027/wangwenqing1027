package com.datou.demo.model;

/**
 * 快捷键：command+n并选择后自动生成get和set方法
 * 本model的用意是登录结果的返回值格式化
 */

public class LoginResultModel {
    Boolean success;
    String failReason;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
}
