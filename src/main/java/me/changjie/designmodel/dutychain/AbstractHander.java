package me.changjie.designmodel.dutychain;

/**
 * Created by ChangJie on 2018/10/26.
 */
public abstract class AbstractHander {

    /**
     * 下一个节点
     */
    protected AbstractHander nextHandler;

    /**
     * 本节点的处理方法
     * @param days
     */
    public abstract void handle(int days);

    /**
     * 给本节点设置后继节点
     * @param nextHandler
     */
    public void setNextHandler(AbstractHander nextHandler) {
        this.nextHandler = nextHandler;
    }
}
