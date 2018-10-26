package me.changjie.designmodel.proxy;

/**
 * Created by ChangJie on 2018/10/19.
 */
public class SubjectProxy implements Subject {

    private SubjectImpl subject;

    public SubjectProxy(SubjectImpl subject) {
        this.subject = subject;
    }

    @Override
    public void doSomething() {

        System.out.println("代理类额外操作");
        subject.doSomething();
        System.out.println("代理类额外操作");
    }

    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy(new SubjectImpl());
        subjectProxy.doSomething();
    }
}
