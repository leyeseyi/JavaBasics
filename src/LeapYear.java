/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.Scanner;
/**
 *
 * @author Leyeseyi
 */
    /*QUESTION: Write a program that prompts the user to enter a year and the
    first three letters of a month name (with the first letter in uppercase) and displays
    the number of days in the month. */
public class LeapYear {
    //private String month;
   // private int year;
    public void monthDate(String month, int year){
        String thirtyone,thirty, twentynine;
        if(year%4==0){
            //for Leap year (366 days)
            if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct")  || month.equals("Dec")){
                thirtyone = "31 days"; 
                System.out.println(month+ " " +year+ " has " +thirtyone);
            }
            else if (month.equals("Sep") || month.equals("Apr") || month.equals("Jun") || month.equals("Nov") ){
                thirty = "30 days";
                System.out.println(month+ " " +year+ " has " +thirty);
            }
            else if(month.equals("Feb")){
                twentynine = "29 Days";
                System.out.println(month+ " " +year+ " has " +twentynine);
            }
         }
        else{
            //For year (365 days)
            if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct")  || month.equals("Dec")){
                thirtyone = "31 days"; 
                System.out.println(month+ " " +year+ " has " +thirtyone);
            }
            else if (month.equals("Sep") || month.equals("Apr") || month.equals("Jun") || month.equals("Nov") ){
                thirty = "30 days";
                System.out.println(month+ " " +year+ " has " +thirty);
            }
            else if(month.equals("Feb")){
                twentynine = " 28 Days ";
                System.out.println(month+ " " +year+ " has " +twentynine);
        }
        
    }
    }
    
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String b = input.nextLine(); 
        
        System.out.println("Enter a year: ");
        int a = input.nextInt();
        
       
         
        LeapYear leap = new LeapYear();
        
        leap.monthDate(b,a);
      
        
    }   
}

