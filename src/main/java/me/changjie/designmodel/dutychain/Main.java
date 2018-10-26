package me.changjie.designmodel.dutychain;

/**
 * Created by ChangJie on 2018/10/26.
 */
public class Main {

    public static void main(String[] args) {
        //初始化责任链
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerC handlerC = new HandlerC();
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.handle(13);

    }
}
