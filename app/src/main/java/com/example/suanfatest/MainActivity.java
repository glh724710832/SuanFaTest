package com.example.suanfatest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("开机");
      //  TuZi();  //兔子问题
        FindDaffodilNumber();

    }

    /*题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
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


    /*
      题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
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
  }

