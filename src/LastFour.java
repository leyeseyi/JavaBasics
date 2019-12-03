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
public class LastFour {
    public static void main (String [] love){
        System.out.println("Enter value:");
        Scanner input = new Scanner (System.in);
        String s = input.nextLine();
        int start = (s.length()) - 4;
        int end = (s.length());
        if(s.length()>3){
            System.out.println( s.substring(start,end));     
        }
        else
            System.exit(1);
    
    }
}
