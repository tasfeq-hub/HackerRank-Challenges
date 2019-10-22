package com.tasfeq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    //Write your code here
}

class MyRegex {
    String subPattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = subPattern + "\\." + subPattern + "\\." + subPattern + "\\." + subPattern;
}
