package com.tasfeq;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=1;i<=10;i++){
            if(N>=2 && N<=20){
                System.out.println(N+" x "+i+" = "+(N*i));
            }
        }

        scanner.close();
    }
}
