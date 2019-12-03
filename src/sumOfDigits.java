
//Write a program that reads an integer between 0 and 1000 and adds all 
//the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.

import java.util.Scanner;

public class sumOfDigits{
    
    private int  a,b,c,sum;
    private static int value;
    
   public int computations(int value){
       
       
       if(value>99 && value <1000){
           
           this.a = value/100;
           this.b = (value/10) % 10;
           this.c = value% 10;
          
           return sum = a + b + c;
           
           
       }
       else if(value>9 && value <100){
           this.a = value/10;
           this.b = value % 10;
           
            return   sum = a + b;
       }
       else if(value>0 && value <10){
           return value;
       }
       else
           System.exit(1);
       
       return 0;
   }
   
   public static void main(String [] args){
       
       
       sumOfDigits test = new sumOfDigits();
       
       Scanner input = new Scanner (System.in);
       System.out.print("Enter a value between 0 - 1000: ");
       value= input.nextInt();
       System.out.println("The sum of the digits is: " +test.computations(value));
   }
}
