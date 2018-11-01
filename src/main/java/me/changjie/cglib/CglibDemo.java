package me.changjie.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ChangJie on 2018/11/1.
 */
public class CglibDemo {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ProxyedClass.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println(method.getName()+"之前的调用");
                methodProxy.invokeSuper(o, objects);
                System.out.println(method.getName()+"之后的调用");
                return null;
            }
        });

        ProxyedClass proxyedClass = (ProxyedClass) enhancer.create();
        proxyedClass.proxyedMethod();
    }
}
