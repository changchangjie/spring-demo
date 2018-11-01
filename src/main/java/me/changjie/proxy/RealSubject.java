package me.changjie.proxy;

/**
 * Created by ChangJie on 2018/11/1.
 */
public class RealSubject implements Subject {

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
