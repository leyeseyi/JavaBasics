
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
public class InputMismatch {
    
    public int add(int numberOne, int numberTwo){
        
      int sum = numberOne + numberTwo;
      
      return sum;
             
            
    }
    public void getInput(){
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter another number: ");
        int b = input.nextInt();
            System.out.println("Sum is: " +add(a,b));
        }
        catch(InputMismatchException e){
            System.out.println("Only Integers are allowed");
            getInput();
        }
    }
    public static void main(String [] args){
        InputMismatch test = new InputMismatch();
        test.getInput();
    }
}
