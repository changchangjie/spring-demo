package me.changjie.designmodel.dutychain;

/**
 * Created by ChangJie on 2018/10/26.
 */
public class HandlerC extends AbstractHander {

    @Override
    public void handle(int days) {
        if(days < 15){
            System.out.println("**条件符合，由C自己处理这个请求");
        }else{
            System.out.println("##条件不符合，由C转发这个请求到下一个处理者");
            if(nextHandler != null){
                nextHandler.handle(days);
            }
        }
    }
}
