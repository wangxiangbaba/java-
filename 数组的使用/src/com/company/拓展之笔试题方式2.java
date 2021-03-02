package com.company;

public class 拓展之笔试题方式2 {
    public static void main(String[] args) {
        // write your code here
        int[] arr=new int[6];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*30)+1;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    i--;
                    break;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
