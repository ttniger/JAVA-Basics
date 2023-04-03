package org.example;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the title : ");
        String Title = scanner.nextLine();
        System.out.println("a=");
        int a = scanner.nextInt();
        System.out.println("b=");
        int b = scanner.nextInt();
        int c = a+b;
        System.out.printf("%S : %d",Title,c);
//        System.out.printf("%d",c);

    }
}
