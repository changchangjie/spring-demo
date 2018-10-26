package me.changjie.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by ChangJie on 2018/10/26.
 */
public class BeanC implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("C被初始化了");
    }
}
