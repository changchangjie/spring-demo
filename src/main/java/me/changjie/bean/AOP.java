package me.changjie.bean;

/**
 * Created by ChangJie on 2018/10/30.
 */
public class AOP {

    public void before(){
        System.out.println("aop before");
    }

    public void after(){
        System.out.println("aop after");
    }

    public void afterReturn(){
        System.out.println("aop afterReturn");
    }

    public void around(){
        System.out.println("aop around");
    }
}
