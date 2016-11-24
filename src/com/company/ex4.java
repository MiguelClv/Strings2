package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 22/11/2016.
 */
public class ex4 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean star = false;
        System.out.println("Dime un texto:");
        String str = scanner.next();

        for (int i =0; i<str.length()-1;i++){
            if (str.charAt(i)=='*'){
                if (i==0){
                }
                if (i>=1 && i<str.length())
                    if (str.charAt(i-1) == str.charAt(i+1)){
                        star = true;
                    }
                    else {
                        star=false;
                    }
            }

        }

        System.out.println(star);

    }

}
