package com.company;

public class 数组的复制 {
    public static void main(String[] args) {
        // write your code here
        int[] arr1,arr2,arr3;
        arr1=new int[]{2,3,5,7,11,13,17,19};
        for(int i=0;i< arr1.length;i++) {
            System.out.print(arr1[i]+"\t");
        }
        arr3=new int[arr1.length];
        System.out.println();
        for(int i=0;i< arr3.length;i++){
            arr3[i]=arr1[i];
            System.out.print(arr3[i]+"\t");
        }//数组的复制

        arr2=arr3;/**不能乘坐数组的赋值*/
        for(int i=0;i<arr2.length;i++){
            if(i%2==0){
                arr2[i]=i;
            }
        }

        System.out.println();
        for(int i=0;i< arr2.length;i++) {
            System.out.print(arr3[i]+"\t");
        }

    }
}
