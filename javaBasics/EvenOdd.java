package javaBasics;

import java.util.Scanner;

public class EvenOdd {
    int i;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter number");
         int i=scanner.nextInt();
        if(i%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
    
}
