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
public class Encryption {
    private String key;
    private int encrypted;
    Scanner input = new Scanner(System.in);
    
    public void getPassword(){
        
        System.out.println("Enter four digit value: ");
        key = input.nextLine();
       if(key.length()== 4){
           //parsing string value to integer
            encrypted = Integer.parseInt(key);
            
            //computations 
            int a = encrypted/1000;
            int b = encrypted/100%10 ;
            int c = encrypted/10%10;
            int d = encrypted%10;
           

            //Adding 7 to each number
            a += 7;
            b += 7;
            c += 7;
            d += 7;
            
            //getting remainder after dividing by 10 and swapping the digit
             a = a%10;
             b = b%10;
             c = c%10;
             d = d%10;

            //Encrypted value
            System.out.format("Encrypted key is: %d %d %d %d", c, d, a, b);
           // System.out.println(" " +encrypted);
       }
       else{
           System.out.println("Enter a four digit value: ");
       }
    }
    public static void main (String [] love){
        Encryption test = new Encryption();
        test.getPassword();
    }
}
