    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//EXCERCISE 2.7
//    (Find the number of years) Write a program that prompts the user to enter the
//minutes (e.g., 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.

import java.util.Scanner;
/**
 *
 * @author Leyeseyi
 */
public class YearConversion {
    
    private static long minutesInAYear = 525600;
    private static long minutesInAday = 1440;
    private static long minutes,year,days;
    
    public static void main (String [] args){
        
        //create an instance of scanner class
        
        Scanner input = new Scanner(System.in);
        
        //get input from the user
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextLong();
        
        //Calculate number of years
        year = minutes/minutesInAYear;
        
        //Calculate number of days
        
        days = (minutes%minutesInAYear)/1440;
        
        System.out.println(minutes +" minutes is approximately: " +year+ " years " + days+ " days");

        
    }
    
}
