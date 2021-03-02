package com.company;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int studentNumber = scan.nextInt();
        int[] score = new int[studentNumber];
        System.out.println("请输入"+studentNumber+"学生成绩:");
        int maxScore = 0;
        for(int i=0;i<score.length;i++){
            score[i] = scan.nextInt();
            if(maxScore<score[i]){
                maxScore=score[i];
            }
        }
        char level;
        for(int i=0;i<score.length;i++){
            if(maxScore-score[i]<=10){
                level = 'A';
            }
            else if(maxScore-score[i]<=20){
                level = 'B';
            }
            else if(maxScore-score[i]<=30){
                level = 'c';
            }
            else{
                level = 'D';
            }
            System.out.println("学生"+i+"成绩为"+score[i]+"等级为"+level);
        }
    }
}
