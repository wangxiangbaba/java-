/*优化一：break
package com.company;
//输入100以内的质数
public class 判断100以内的质数优化版 {
    public static void main(String[] args) {
        // write your code here
        long start=System.currentTimeMillis();//获取当前实践距离1970.01.01.00.00的毫秒数
            for(int i=2;i<=100000;i++){//遍历100以内的自然数
            boolean isFlag=true;//顺带每次循环充值isFlag
            for(int j=2;j<i;j++){//被i去除
                if(i%j==0){//i被j除尽
                    isFlag=false;
                    break;//优化一：只对本身非质数的自然数是有效的！！！！！！！！
                }
            }
            if(isFlag==true){
                System.out.println(i);
            }
        }
        long end=System.currentTimeMillis();//获取当前实践距离1970.01.01.00.00的毫秒数
        System.out.println("所花费的时间为 "+(end-start));//所花费的时间为 1783
    }
}
*/
package com.company;//优化版本二
/*//输入100以内的质数
public class 判断100以内的质数优化版 {
    public static void main(String[] args) {
        // write your code here
        long start=System.currentTimeMillis();//获取当前实践距离1970.01.01.00.00的毫秒数
        for(int i=2;i<=100000;i++){//遍历100以内的自然数
            boolean isFlag=true;//顺带每次循环充值isFlag
            for(int j=2;j<Math.sqrt(i);j++){//被i去除//对本身是质数的自然数是有效的
                if(i%j==0){//i被j除尽
                    isFlag=false;
                    break;//优化一：只对本身非质数的自然数是有效的！！！！！！！！
                }
            }
            if(isFlag==true){
                System.out.println(i);
            }
        }
        long end=System.currentTimeMillis();//获取当前实践距离1970.01.01.00.00的毫秒数
        System.out.println("所花费的时间为 "+(end-start));//所花费的时间为 106
    }
}
*/
public class 判断100以内的质数优化版 {//优化方式三
    public static void main(String[] args) {
        // write your code here
        long start=System.currentTimeMillis();//获取当前实践距离1970.01.01.00.00的毫秒数
        label:for(int i=2;i<=100000;i++){//遍历100以内的自然数
            for(int j=2;j<Math.sqrt(i);j++){//被i去除//对本身是质数的自然数是有效的
                if(i%j==0){//i被j除尽
                    continue label;
                }
            }
                System.out.println(i);
        }
        long end=System.currentTimeMillis();//获取当前实践距离1970.01.01.00.00的毫秒数
        System.out.println("所花费的时间为 "+(end-start));//所花费的时间为 106
    }
}
