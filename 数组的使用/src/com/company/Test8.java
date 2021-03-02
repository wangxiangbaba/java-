package com.company;
//生成一个随机十个二维数的元素数组   并且求出最大值 最小值  平均值  平均数
public class Test8 {
    public static void main(String[] args) {
        // write your code here
        int[] arr=new int[10];
        int maxValue=arr[0];
        int minValue=arr[0];
        int sum=0;
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*90)+10;
            System.out.print(arr[i]+"\t");
            if(maxValue<arr[i]){
                maxValue=arr[i];
            }
            if(minValue>arr[i]){
                minValue=arr[i];
            }
            sum+=arr[i];
        }
        double average=(double)(sum)/10;
        System.out.println("\n"+"最大值为："+maxValue);
        System.out.println("最小值为："+minValue);
        System.out.println("总和为为："+sum);
        System.out.println("平均数为为："+average);
    }
}
