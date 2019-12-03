/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Question: A program that checks five integer numbers if its a palindrome
    import java.util.Scanner;
/**
 *
 * @author Leyeseyi
 */
public class Palindrome {
    
    private int value;


    public boolean isPalindrome(){
                
        //Create Scanner Class
        Scanner input = new Scanner (System.in);
        
        //Getting Input from user
        System.out.println("Enter a five digit word: ");
        value=input.nextInt();
        
        //Convert value to string
        String valueAsString = Integer.toString(value);
               
        //create a stringbuilder instance
        StringBuilder reversedWord = new StringBuilder(valueAsString);
        
        if(valueAsString.length()==5){
            
            if(valueAsString.equals(reversedWord.reverse().toString())){

              //  System.out.println(value+" is a palindrome");
                
                return true;
          
            }
            else
                //System.out.println(value +"is not a palindrome");
                return false;
        }
        else{
         
            System.out.println("Error: Enter a five digit number");
            
        }
        return false;
    }
    
    public static void main(String [] args){
        
        Palindrome test = new Palindrome();
        
        if(test.isPalindrome())
            System.out.println(test.value + " is a palindrome");
        
        else
            System.out.println(test.value+" is not a palindrome");
            
    }
}
