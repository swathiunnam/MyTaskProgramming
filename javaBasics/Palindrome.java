package javaBasics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.nextLine();
        String org_str=str; 
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        if(org_str.equals(rev)){
            System.out.println(org_str+" is palindrome string");
        
        }
        else{
            System.out.println(org_str+" is not palindrome string");

        }

    }
    
}
