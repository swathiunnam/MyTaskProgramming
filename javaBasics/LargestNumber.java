package javaBasics;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=scanner.nextInt();
        System.out.println("Enter second number:");
        int b=scanner.nextInt();
        System.out.println("Enter third number:");
        int c=scanner.nextInt();
        if(a>b && a>c){
            System.out.println("a is big");
        }
        else if(b>a && b>c){
            System.out.println("b is big");
        }
        else {
            System.out.println("c is big");
        }

    }
    
}
