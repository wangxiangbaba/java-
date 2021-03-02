package com.company;

public class Test13 {
    public static void main(String[] args) {
        // write your code here
        label:for(int i=1;i<=4;i++){
            for(int j=1;j<=10;j++){
                if(j%4==0){
                    //break;//默认跳出包裹此关键字最近的循环
                    //continue;//默认跳出包裹此关键字最近的循环
                    //break label;//结束指定标识的一层循环结构
                    continue label;//结束指定标识label的一层循环结构
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
