package com.company;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr=new int[]{43,45,855,1615,4,-21,-2,-55,-555};
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i< arr.length-1;i++){
            boolean isFlag=false;//标记元素是否产生交换
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isFlag=true;
                }
            }
            if(isFlag){//元素没有产生交换 说明已经排序完成 结束循环
                break;
            }
        }
        System.out.println();
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
