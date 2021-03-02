package com.company;

public class Test1 {
    public static void main(String[] args) {
        // write your code here
        int[]   ids;
        ids =   new int[]{1001,1002,1003,1004};
        //静态初始化
        String[] names = new String[5];
        //动态初始化
        names[0]="你好";
        names[1]="你好吗";
        names[2]="你好妈妈";
        names[3]="你好妈妈吗";
        names[4]="你好妈妈吗码";
        System.out.println(names.length);

        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }

    }
}
//int[] arr=new int[];
//int[5] arr=new int[5];
//int[] arr=new int[3]{1,2,3};