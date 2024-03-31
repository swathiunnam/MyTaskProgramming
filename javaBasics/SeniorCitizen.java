package javaBasics;

import java.util.Scanner;

public class SeniorCitizen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age:");
        float age=scanner.nextFloat();
        if(age<=18){
            System.out.println("Not a senior citizen");
          }
          else{
            System.out.println("Senior citizen");
          }
        }
}
