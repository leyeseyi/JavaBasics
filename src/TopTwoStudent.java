
import java.util.Scanner;

//1.	Write a program that prompts the user to enter the number of students and each student’s name and score, 
//      and finally displays the student with the highest score and the student with the second-highest score.

//NAME: OLALEYE VICTOR OLUSEYI
public class TopTwoStudent {
    
   //declaring variables 
    private int n;
    private int score;
    private int max = 0;
    private int  secondMax = 0;
    private String maxName;
    private String secondMaxName;
    
    public void Once(){
        
        //create an object of scanner class
        Scanner input = new Scanner (System.in);
        
        //get array length
        System.out.println("Enter the number of students: ");
        n = input.nextInt();
        
        //create array
        int [] myArray = new int [n];
        
        //get inputs
        for (int i=0; i<myArray.length; i++){
            System.out.println("Enter Student Name: ");
            String name = input.next();
            System.out.println("Enter Student Score: ");
            score= input.nextInt();
            if(score>max){
                secondMax = max;
                secondMaxName = maxName;
                        
                max = score;
                maxName = name;
            }
         
        }
        
            //Generate Output
           System.out.println("BEST STUDENT: ");
            System.out.println("Name: " + maxName);
            System.out.println("Score: " + max);
            
            System.out.println("SECOND BEST STUDENT; ");
            System.out.println("Name: " + secondMaxName);
            System.out.println("Score: " + secondMax);
    }
    public static void main (String [] args){
        TopTwoStudent test = new  TopTwoStudent();
        test.Once();
    }
}
