package 反射1;

import java.io.Serializable;

/**
 * @author wangxiang
 * @create 2021/1/2
 */
public class Creater<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }
}
