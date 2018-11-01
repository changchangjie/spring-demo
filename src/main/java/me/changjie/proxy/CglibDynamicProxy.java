package me.changjie.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ChangJie on 2018/11/1.
 */
public class CglibDynamicProxy {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        ////设置增强类的父类
        enhancer.setSuperclass(RealSubject.class);
        //设置拦截器，拦截对父类所有非final方法的调用
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println(o.getClass().getName());
                System.out.println("cglib动态代理before");
                //调用父类方法
                methodProxy.invokeSuper(o, objects);
                System.out.println("cglib动态代理after");
                return null;
            }
        });

        //创建动态代理对象
        Subject subject = (Subject) enhancer.create();
        System.out.println(subject.getClass().getName());

        subject.hello();
    }
}
