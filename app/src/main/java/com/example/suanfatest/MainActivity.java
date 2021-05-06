package com.example.suanfatest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    /*
     准备完成计划，一个算法题对应一个界面和布局，添加常用组件来熟悉
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("开机");
        //TuZi();
        //TuZi(12);
        // FindDaffodilNumber();
        //FenJie();
        TestBall(100.00,10);
        //Ball();


    }

    /*题目1：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
     *小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
     */
    private void TuZi() {
        System.out.println("兔子问题");

        int a = 1; //第一个月对数
       System.out.println("第一个月对数"+a+",即兔子数量"+2*a);
        int b = 1; //第二个月
        System.out.println("第二个月对数"+b+",即兔子数量"+2*b);

        int month=12;  //月份
        int number;

        for(int i=3; i<=month; i++) {
            number = b;
            b = a + b;
            a = number;
            Log.d(TAG, "TuZi: "+"第" + i +"个月的兔子对数: "+b+",即兔子数量"+2*b);
             System.out.println("第" + i +"个月的兔子对数: "+b+",即兔子数量"+2*b);
        }
    }


    public  void  TuZi( int month){
        System.out.println("兔子问题");

        int a = 1; //第一个月对数
        System.out.println("第一个月对数"+a+",即兔子数量"+2*a);
        int b = 1; //第二个月
        System.out.println("第二个月对数"+b+",即兔子数量"+2*b);

    // int month=12;  //月份
        int number;
        for(int i=3; i<=month; i++) {
            number = b;
            b = a + b;
            a = number;
            Log.d(TAG, "TuZi: "+"第" + i +"个月的兔子对数: "+b+",即兔子数量"+2*b);
            System.out.println("第" + i +"个月的兔子对数: "+b+",即兔子数量"+2*b);
        }

    }


    /*
      题目3：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
        153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
     */
    private void FindDaffodilNumber() {
        System.out.println("水仙花数问题");
        int a;
        int b;
        int c;
        for(int i=101; i<1000;i++) {
            a = i / 100;   //百位
            b = i % 100 / 10;   //十位
            c = i % 10;  //个位
            if((a*a*a + b*b*b +c*c*c) ==i) {
                Log.d(TAG, i+"是一个水仙花数");
               // System.out.println(i+"是一个水仙花数");
            }
        }
    }

    /*
     【程序4】FenJie.java
　　　　题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
            质因数 就是一个数的约数，并且是质数。
            1没有质因子
           比如8=2×2×2，2就是8的质因数；
          12=2×2×3，2和3就是12的质因数。
          把一个式子以12=2×2×3的形式表示，叫做分解质因数。
     */
     private void FenJie(){
         System.out.println("分解数问题");
        //scanner方法问题

         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();
         System.out.println("请输入正整数");
          if (number <= 1){
              System.out.println(" 1没有质因子,请再次输入正整数");
          }
         int n =2;
         System.out.println("数字"+number+"=");//必须先输出，下方会循环至达成条件
         while(n <= number) {
             if(n == number) {
                 System.out.println(n);
                 break;
             }
             else if( number % n == 0) {
                 System.out.print(n + "*");
                 number = number/n;  //解决例如 18/2 =9 。9要继续分解的问题

                  }
             else   n++;
         }


     }


     /*【程序10】TestBall.java
　　　　题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
      */
    private void TestBall(double height,int frequency){
        System.out.println("自由落体开始");
        double h = height;
        double rebound = 0; //反弹高度
        for (int i = 1;i < frequency;i++){
            h = h/2;
            rebound = h;
            height =height + rebound;
        }
        System.out.println("在第"+frequency+"次落地时，共经过："+height+"米;"+"在第"+frequency+"次时，反弹："+rebound+"米");
        System.out.println("在第"+frequency+"次时，反弹高度："+rebound+"米");

    }

     private void Ball(){
         System.out.print("自由落体开始");
         double h = 100;
         double height =100;
         double rebound = 0; //反弹高度
         for (int i = 1;i < 10;i++){
             h = h/2;
             rebound = h;
             height =height + rebound;
         }
         System.out.println("在第"+10+"次落地时，共经过："+height+"米;"+"在第"+10+"次时，反弹："+rebound+"米");
         System.out.println("在第"+10+"次时，反弹高度："+rebound+"米");

     }





  }

