package com.atguigu.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author wangxiang
 * @create 2020-12-07-20:21
 * 创建线程方法三：实现Callable接口--JDK5.0新增
 */

/**步骤1：创建一个Callable的实现类*/
class NumThread implements Callable{
    /**步骤2：实现call方法，将此线程需要执行的操作声明在call()*/
    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}

public  class CallableTest {
    public static void main(String[] args) {
        /**步骤3：创建Callable接口实现类的对象*/
        NumThread numThread=new NumThread();
        /**步骤4：将此Callable接口实现的对象numThread作为参数传递到FutureTask()构造器当中，去创建FutureTask的对象*/
        FutureTask futureTask=new  FutureTask(numThread);
        /**步骤5：将FutureTask的对象作为参数传递到Thread类的构造器当中，创建Thread对象，并调用statr()方法*/
        new Thread(futureTask).start();

        try {
            /**步骤6：获取Callable中的call方法的返回值，需要返回值就操作此步骤，不需要在call()方法中return null;*/
// get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
            Object sum = futureTask.get();
            System.out.println("总和为："+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
