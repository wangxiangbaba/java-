package com.company;
import java.util.Scanner;
public class 回形数 {
    public static void main(String[] args) {
        // write your code here
        Scanner getnum = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int size = getnum.nextInt();
        int start = 0;                                       //起始点坐标
        int end = size-1;                              //终止点坐标
        int values = 1;                                      //每个元素的值
        int arr[][] = new int [size][size];                       //创建二维数组
        while(true) {                                                     //循环打印
            for(int i = start;i <= end;i++) {
                arr[start][i] = values;
                values++;
            }                    //打印第一行


            for(int i = start + 1; i<= end;i++) {
                arr[i][end] = values;
                values++;
            }                      //打印最后一列


            for(int i = end - 1;i >= start;i--) {
                arr[end][i] = values;
                values++;
            }                 //打印最后一行

            for(int i = end - 1; i >= start + 1;i--) {
                arr[i][start] = values;
                values++;     //打印第一列
            }

            start++;
            end--;

            if(start >= end) {
                break;                          //当起始点坐标和终止点坐标相等时跳出
            }
        }


        //奇数回形数
        if(size % 2 != 0) {                              //输入的数为偶数是可以直接打印，当输入的数为奇数是，为最中间的数赋值
            arr[end][start] = values;
        }



        for(int i = 0;i < arr.length ;i++) {                       //遍历输出
            for(int j = 0; j < arr[i].length ;j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
