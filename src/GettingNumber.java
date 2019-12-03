/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */
//This program extracts the digits in a string
public class GettingNumber {
    
        
    public static void main (String [] love){
        GettingNumber test = new GettingNumber();
        System.out.println("integer is: " +test.extract("asfdf435435sfdsfds"));
    }
    public String extract(String j){
        char x;
        String num="";
                
        for(int i=0; i < j.length(); i++){
            
            //get each character string
            x = j.charAt(i);
            
            //check if character is a number
            if(Character.isDigit(x)){
                num += x;
            }
            
        }
        
      return num; 
    }
}
