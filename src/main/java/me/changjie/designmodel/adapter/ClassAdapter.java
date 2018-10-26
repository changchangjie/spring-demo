package me.changjie.designmodel.adapter;

/**
 * Created by ChangJie on 2018/10/19.
 */
public class ClassAdapter extends Cock implements Duck {

    @Override
    public void quack() {
        gobble();
    }
}
