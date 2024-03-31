package javaBasics;

import java.util.Scanner;

public class SumGreatest {
    public static void main(String[] args)
     {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
         int a= scanner.nextInt();
          System.out.println("Enter second number");
          int b= scanner.nextInt();
          System.out.println("Enter third number");
          int c= scanner.nextInt();
          System.out.println("Enter fourth number");
           int d= scanner.nextInt();
           int x=a+b;
           int y=c+d;
           System.out.println("Sum of a+b is:"+ x);
           System.out.println("Sum of c+d is:"+ y);
   if(x>=y){
    System.out.println("Sum of a+b is Greatest");
   }
   
   else  {
    System.out.println("Sum of c+d is Greatest");
   }
}




}