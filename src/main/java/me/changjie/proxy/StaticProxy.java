package me.changjie.proxy;

/**
 * Created by ChangJie on 2018/11/1.
 */
public class StaticProxy implements Subject {

    //代理对象持有委托类的引用
    private Subject realSubject;

    public StaticProxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void hello() {
        System.out.println("静态代理before");
        realSubject.hello();
        System.out.println("静态代理after");
    }


    public static void main(String[] args) {
        Subject subject = new StaticProxy(new RealSubject());
        subject.hello();
    }
}
