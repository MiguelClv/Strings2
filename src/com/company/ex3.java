package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 22/11/2016.
 */
public class ex3 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        boolean igual = false;
        int catcont = 0;
        int dogcount = 0;

        System.out.println("Dame un string:");
        String str = scanner.next();
        try {
            for (int i = 0; i < str.length()-2; i++) {
                String sub = str.substring(i, i + 3);
                if ((sub.equals("cat"))) {
                    catcont++;
                }
                if ((sub.equals("dog"))) {
                    dogcount++;
                }
            }
        }catch (Exception e){

        }

        if (catcont==dogcount){
            igual = true;
        }
        System.out.println(igual);

    }
}
