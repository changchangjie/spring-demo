package me.changjie.controller;

import me.changjie.bean.RequestDomain;
import me.changjie.bean.ResponseDomain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ChangJie on 2018/10/30.
 */
@RestController
public class ControllerA implements BeanFactoryAware, ApplicationContextAware {

//    @Autowired
    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;

    @RequestMapping(value = "demo")
    public String demo(){

        ControllerB controllerB = (ControllerB) applicationContext.getBean("controllerB");
        controllerB.test();
        System.out.println("demo");
        return "hello";
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @RequestMapping(value = "jsonTest")
    public ResponseDomain jsonTest(RequestDomain requestDomain){
        System.out.println(requestDomain.getNewPassword());
        ResponseDomain domain = new ResponseDomain();
        domain.setNewName("changjie");
        return domain;
    }
}
