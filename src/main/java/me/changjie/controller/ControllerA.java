package me.changjie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChangJie on 2018/10/30.
 */
@RestController
public class ControllerA {

    @RequestMapping(value = "demo")
    public String deom(){
        return "hello";
    }
}
