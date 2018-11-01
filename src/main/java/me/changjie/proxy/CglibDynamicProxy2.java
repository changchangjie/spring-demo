package me.changjie.proxy;

import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * Created by ChangJie on 2018/11/1.
 */
public class CglibDynamicProxy2 {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);

        Callback interceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println(o.getClass().getName());
                System.out.println("cglib动态代理2before");
                //调用父类方法
                methodProxy.invokeSuper(o, objects);
                System.out.println("cglib动态代理2after");
                return null;
            }
        };

        //NoOp表示no operator，即什么操作也不做，代理类直接调用被代理的方法不进行拦截
        enhancer.setCallbacks(new Callback[]{interceptor, NoOp.INSTANCE});

        CallbackFilter filter = new CallbackFilter() {
            @Override
            public int accept(Method method) {
                if (method.getName().equals("hello2")) {
                    System.out.println("我将此方法过滤掉了，不对该方法进行拦截");
                    return 1;//对应拦截器数组索引，NoOp.INSTANCE
                }
                return 0;//对应拦截器数组索引，interceptor
            }
        };


        enhancer.setCallbackFilter(filter);

        RealSubject realSubject = (RealSubject) enhancer.create();
        realSubject.hello();
        realSubject.hello2();


    }
}
