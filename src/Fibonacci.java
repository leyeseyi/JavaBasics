
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */
public class Fibonacci {
    
    public static ArrayList<Integer> fibonacci(int i){
        
        ArrayList<Integer> myList = new ArrayList();
        myList.add(0);
        myList.add(1);
        myList.add(1);
        if(i==0){
            myList.add(0);
            return myList;
        }
        else if(i==1){
             System.out.println(myList.get(0));      
            return myList;
        }
        
        else{
            
        
            for(int j=3; j<=i; j++){
                
                int sum = (myList.get(j-1))+(myList.get(j-2));

                if(sum<i){

                    myList.add(sum);

                }
                else
                    return myList;

            }
            
        }
    
        return myList;
    }
    
    public static void main(String ... args){
        
        
        System.out.println("Fibonacci numbers: " +fibonacci(3));
        
    }
    
    
}
