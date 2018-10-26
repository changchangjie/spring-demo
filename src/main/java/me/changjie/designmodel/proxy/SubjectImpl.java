package me.changjie.designmodel.proxy;

/**
 * Created by ChangJie on 2018/10/19.
 */
public class SubjectImpl implements Subject {

    @Override
    public void doSomething() {
        System.out.println("真正实现");
    }
}
