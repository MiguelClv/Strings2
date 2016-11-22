package com.company;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce primera cadena:");
        String a = scanner.next();
        System.out.println("Introduce segunda cadena:");
        String b = scanner.next();

        int max=Math.max(a.length(),b.length());
        String resultado="";

        for (int i=0; i<max; i++){
            if (i<a.length()){
                resultado=resultado + a.charAt(i);
            }
            if (i<b.length()) {
                resultado = resultado + b.charAt(i);
            }
        }
        System.out.println(resultado);
    }
}
