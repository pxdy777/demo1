package com.example.demo;

public class Demo01  {
    // 编写一个Java程序，实现以下功能：从键盘接收一个整数n，然后计算并输出1!+2!+3!+...+n!的和。
    public static void main(String[] args){
        int n = 5; // 假设n为5
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial *= j;
            }
            sum += factorial;
        }
        System.out.println("1!+2!+3!+...+n!的和为：" + sum);
    }
}
