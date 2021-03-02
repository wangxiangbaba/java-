package com.company;

import java.util.SplittableRandom;

public class 数组的反转 {
    public static void main(String[] args) {
        String[] arr=new String[]{"JJ","DD","MM","BB","GG","AA"};
        String[] arr1=new String[arr.length];
        for(int i=0;i< arr.length;i++) {//方式一
            System.out.print(arr[i]+"\t");
        }
        for(int i=0;i< arr.length/2;i++){
                String temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
        }
        System.out.println();
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
