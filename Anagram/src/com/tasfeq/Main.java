package com.tasfeq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] characterHash = new int[127];

        for(int i=0; i<a.length(); i++){
            characterHash[a.charAt(i)]++;
        }

        for(int j=0; j<b.length(); j++){
            characterHash[b.charAt(j)]--;
        }

        for(int k=0; k<characterHash.length ; k++){
            if(characterHash[k] != 0){
                return false;
            }
        }

        return true;
    }
}
