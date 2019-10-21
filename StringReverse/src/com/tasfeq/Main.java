package com.tasfeq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        /* Enter your code here. Print output to STDOUT. */

        StringBuilder inputString = new StringBuilder();
        inputString.append(A);
        inputString = inputString.reverse();
        System.out.println(A.equals(inputString.toString())? "Yes" : "No");
    }
}
