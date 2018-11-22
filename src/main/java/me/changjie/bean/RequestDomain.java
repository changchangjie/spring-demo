package me.changjie.bean;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by ChangJie on 2018/11/22.
 */
public class RequestDomain {

    @JSONField(name = "new_password")
    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
