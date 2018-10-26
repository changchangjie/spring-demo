package me.changjie.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by ChangJie on 2018/10/19.
 */
public class MyTask {

    public void method1() throws InterruptedException {
        System.out.println("method1 execute thread:"+Thread.currentThread().getName());
        System.out.println("method1 execute time:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        try{

        }catch (Exception e){
            throw new RuntimeException();
        }
//        TimeUnit.SECONDS.sleep(20);
    }

    public void method2() {
        System.out.println("method2 execute thread:"+Thread.currentThread().getName());
        System.out.println("method2 execute time:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
