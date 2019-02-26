package me.changjie.bean;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by ChangJie on 2018/11/22.
 */
public class ResponseDomain {

    static {
        System.out.println(342423432);
    }

    private String test = get();

    private String get(){
        System.out.println("常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常常");
        return "111";
    }

    @JSONField(name = "new_name")
    private String newName;

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
