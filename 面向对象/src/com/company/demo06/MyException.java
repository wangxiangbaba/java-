package com.company.demo06;

public class MyException extends Exception{
    private int detail;
    public MyException(int a){
        this.detail=a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
