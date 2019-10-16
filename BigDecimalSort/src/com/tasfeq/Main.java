package com.tasfeq;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s,0,n, new Comparator<String>() {
            public int compare(String s1, String s2) {
                BigDecimal A = new BigDecimal(s1);
                BigDecimal B = new BigDecimal(s2);
                return B.compareTo(A); // descending order
            }
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
