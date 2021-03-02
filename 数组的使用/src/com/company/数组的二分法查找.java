package com.company;

public class 数组的二分法查找 {
    public static void main(String[] args) {
        int[] arr2=new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int dest=-34;
        int head=0;
        int end=arr2.length-1;
        boolean isFlag=true;
        while(head<=end){
            int middle=(head+end)/2;
            if(dest== arr2[middle]){
                System.out.println("找到了指定的元素"+dest+"\n位置为"+middle);
                isFlag=false;
                break;
            }else if(arr2[middle]>dest){
                end=middle-1;
            }else{
                head=middle+1;
            }
        }
        if(isFlag){
            System.out.println("很抱歉没有找到");
        }
    }
}
