package javaBasics;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first value");
        int num1=scanner.nextInt();
        System.out.println("Enter second value");
        int num2=scanner.nextInt();
        System.out.println("Before swapping the values are:" +num1+ "  " +num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping the values are:"+num1+ "  " +num2);
    }
    
}
