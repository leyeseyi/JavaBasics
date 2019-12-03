
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */

//This program checks the anagram of two parsed strings

public class Anagram {
    private StringSort stringSort;
    String X1, Y1;
    
   public boolean anagram(String x, String y){
       
       StringSort string = new StringSort();
        
        if(x.contains(" ")){
           
           String [] xArray =  x.split(" ");
            x = "";
           for(int i=0; i<xArray.length;i++){
                X1 = xArray[i];
                x += X1;
                
            }    
        }
        if(y.contains(" ")){
            String [] yArray =  y.split(" ");
            y = "";
            for(int i=0; i<yArray.length;i++){
                Y1 = yArray[i];
                y += Y1;
            }    
        }        
        //comparing x and y
        if(Arrays.equals(string.stringSort(string.sort(x)), string.stringSort(string.sort(y))))
            return true;
    return false;
    }
   
   public static void main(String ... args){
       
       
       Anagram test = new Anagram();
      
       System.out.println("Checking anagram: " +test.anagram(" nonso is here ", "nnsooisereh"));
       
       
   }
}
