package com.company;

public class 数组的线性查找 {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA"};
        String[] arr1 = new String[arr.length];
        String dest = "BB";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了指定的元素:"+dest+"\n位置为" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("很遗憾没有找到");
        }
    }
}
