package com.tasfeq;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static Boolean flag = (B>0 && H>0);

    static{
        if(!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

