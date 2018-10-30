package me.changjie.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by ChangJie on 2018/10/26.
 */
public class BeanA implements InitializingBean {

    private String name;

    private int age;

    private BeanB beanB;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("A Initializing");
        test();
    }

    public void test(){
        System.out.println("A test()");
    }

}
