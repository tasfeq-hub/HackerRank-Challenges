package com.tasfeq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Input (stdin)
            2
            0 2 10
            5 3 5

            Expected Output
            2 6 14 30 62 126 254 510 1022 2046
            8 14 26 50 98

         */

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;

            if(a>=0 && b<=500 && (n>=1 && n<=15)){
                for (int j=0;j<n;j++){
                    sum += (b*Math.pow(2, j));
                    System.out.print(sum+ " ");
                }
            }

            System.out.println();

        }
        in.close();
    }
}
