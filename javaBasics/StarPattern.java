package javaBasics;

public class StarPattern {

    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++){
                if(j == i || j==n-i+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
        
    }
    
}
