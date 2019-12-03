import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//2.	Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average 
//        and how many scores are below the average. Enter a negative number to signify the end of the input. 
//        Assume that the maximum number of scores is 100.

//NAME: OLALEYE VICTOR OLUSEYI

public class ScoreSort {
    
    //declaring variables
    private int number;
    private int count=1;
    private int sum;
    private int abovecount=0;
    private int lesscount=0;
    private int equalcount=0;
    private double average;
   
    
    public static void main(String [] args){
        ScoreSort test = new ScoreSort();
        test.once();
    }
    
    
    public void once(){
        System.out.println("This program continues until input is negative");
        Scanner input = new Scanner(System.in);
        
        //create a list
        List <Integer> myList = new ArrayList<>();
        System.out.println("Enter a Score: ");
        number = input.nextInt();
        
        //add number to myList
        myList.add(number);
        while(number>=0 && number<=100){
            sum += number;
            
                      
            System.out.println("Enter a Score: ");
            number = input.nextInt();
            
            //Add number to myList
            myList.add(number);
            count++;
        }
        average = sum/(count-1); // removing the count of the last number i.e the negative number
        for(int i = 0; i<myList.size();i++){
            
            //getting count scores above average
            if(myList.get(i)>average){
                abovecount++;
            }
            
            //getting count scores equal to average
            else if(myList.get(i)==average){
                equalcount++;
            }
            
            //getting count scores less than average
            else{
                lesscount++;
            }
        }
        
        
        //Generate output
        System.out.println("Scores: " +myList+ " ");
        System.out.println("Average: " +average);
        System.out.println("Number of Scores greater than average: " +abovecount);
        System.out.println("Number of Scores less than average: " +lesscount);
        System.out.println("Number of Scores equal to average: " +equalcount);
    }
}
