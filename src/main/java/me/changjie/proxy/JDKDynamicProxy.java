package me.changjie.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ChangJie on 2018/11/1.
 */
public class JDKDynamicProxy implements InvocationHandler {

    //中间类持有真正目标类的引用
    private Object subject;

    public JDKDynamicProxy(Object subject) {
        this.subject = subject;
    }


    /**
     * 拦截代理类对象的所有方法
     * @param proxy 代理类对象
     * @param method 具体调用的是代理类的哪个方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(proxy.getClass().getName());
        System.out.println("动态代理before");
        method.invoke(subject, args);//执行目标类方法
        System.out.println("动态代理before");
        return null;
    }

    public static void main(String[] args) {

        InvocationHandler handler = new JDKDynamicProxy(new RealSubject());

        //创建动态代理类实例
        Subject subject = (Subject) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),//定义了代理类的ClassLoder
                new Class[] {Subject.class},//代理类实现的接口列表
                handler);//调用处理器

        System.out.println(subject.getClass().getName());
        subject.hello();

    }
}
