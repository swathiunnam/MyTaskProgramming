package javaBasics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=scanner.nextInt();
        long factorial=1;
        for(int i=1;i<=num;i++){
        factorial=factorial * i;
    }
        System.out.println("Factorial is"+factorial);

    }
    
}
