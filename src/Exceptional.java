
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */

//EXCEPTION HANDLING 1
public class Exceptional {
        
    public  double quotient(int numberOne, int numberTwo){
        if(numberTwo == 0)
           throw new ArithmeticException("Cannot divide by zero");
        
        
        return numberOne/numberTwo;
                    
    }
    public static void main(String []args){
        
        Exceptional test = new Exceptional();
        Scanner input = new Scanner (System.in);
        try{
            
            System.out.println("Enter First Number: ");
            int one = input.nextInt();
            System.out.println("Enter Second Number: ");
            int two =  input.nextInt();
            System.out.println("Quotient: " +test.quotient(one,two));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("only integers are allowed");
        }
        finally{
            System.out.println("inside finally");
        }
        
        System.out.println("After error i move");
        
        
    }
}
