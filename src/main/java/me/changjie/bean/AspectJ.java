package me.changjie.bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by ChangJie on 2018/10/30.
 */
@Aspect
public class AspectJ {

    @Pointcut(value = "execution(* me.changjie.controller.ControllerB.test())")
    public void pointB(){

    }

    @Before(value = "pointB()")
    public void before(){
        System.out.println("annotation aspectj before");
    }

    @After(value = "pointB()")
    public void after(){
        System.out.println("annotation aspectj after");
    }
}
