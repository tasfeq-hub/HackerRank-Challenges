package com.tasfeq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int j;
        for (j = 0; j < s.length(); j++) {
            if (Character.isLetter(s.charAt(j))) {
                break;
            }
        }
        s = s.substring(j);
        if(s.length()==0){
            System.out.println(0);
            return;
        }
        if(s.length()<=400000){
            s.trim();
            if(s.length()==1){
                System.out.println(1);
                System.out.println(s);
            }else{
                s = s.replaceAll("[\\s+|$|!|;|?|_|\\.|#|')]", " ");
                String[] tokens = s.split("[^a-zA-Z|]+");
                System.out.println(tokens.length);
                for(int i=0; i<tokens.length; i++){
                    System.out.println(tokens[i]);
                }
            }
        }
        scan.close();
    }
}
