package me.changjie.bean;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by ChangJie on 2018/11/22.
 */
public class ResponseDomain {

    @JSONField(name = "new_name")
    private String newName;

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }
}
