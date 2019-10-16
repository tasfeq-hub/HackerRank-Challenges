package com.tasfeq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputLine;
        int count = 1;

        while(sc.hasNext()){
            inputLine = sc.nextLine();
            System.out.println(count+ " "+inputLine);
            count++;
        }
    }
}
