/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//QUESTION
/*(Conversion from miles to kilometers) Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
Miles Kilometers
1 1.609
2 3.218
...
9 14.481
10 16.090 */

/**
 *
 * @author Leyeseyi
 */
public class MileKilometer {
    
    public static void main (String [] args){
        System.out.println("Miles \t \t Kilometers");
        for(int i=1; i<=10; i++){
            
            System.out.printf("%d \t \t %.3f \n",i, i*1.609);
        }
    }
}
