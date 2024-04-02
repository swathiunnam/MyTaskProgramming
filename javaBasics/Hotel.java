package javaBasics;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of month:");
        int month=scanner.nextInt();
        System.out.println("Rent per day:");
        float rent_day=scanner.nextFloat();
        System.out.println("Enter the number of days:");
        int days=scanner.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println("Hotel tariff:"+(days*rent_day));
            break;
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
            System.out.println("Hotel tariff is:"+String.format("%.2f",(days*(rent_day+=rent_day*20/100))));
            break;
            default:
            System.out.println("Invalid enter");

                
        
        
            
                
        }

    
        
        


    }
    
}
