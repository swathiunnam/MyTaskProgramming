package javaBasics;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scanner.nextLine();
        System.out.println("The original string is:"+ str);
        String rev="";
        int len=str.length();
        System.out.println("length of string is:"+len);
        for(int i=len-1;i>=0;i--){
            System.out.println(str.charAt(i));
            rev=rev+str.charAt(i);
        }
        System.out.println("reversed string is:"+ rev);
        

        

    }
    
}
