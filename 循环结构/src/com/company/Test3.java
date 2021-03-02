package com.company;
//遍历100以内的偶数并且求出偶数总和和偶数的个数
public class Test3 {
    public static void main(String[] args) {
        // write your code here
        System.out.println("100以内偶数排列为");
        int sum=0;
        int count=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println("\n"+i);
                sum+=i;
                count+=1;
            }
        }
        System.out.println("\n"+"偶数和为"+sum);
        System.out.println("\n"+"偶数的个数为"+count);
    }
}
