package me.changjie.designmodel.adapter;

/**
 * Created by ChangJie on 2018/10/19.
 */
public class ObjectAdapter implements Duck {

    private Cock cock;

    public ObjectAdapter(Cock cock) {
        this.cock = cock;
    }


    @Override
    public void quack() {
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
