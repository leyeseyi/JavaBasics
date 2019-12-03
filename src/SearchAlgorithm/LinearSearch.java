package SearchAlgorithm;


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
public class LinearSearch {
   
    
     
    public String sort(int key, int [] b){
        
        for(int i=0; i<b.length; i++)    {
            if(b[i]==key){
                return b[i]+ " is found at index " +i;
            }
        }

            return "Key not present in the array"; 
    }
    
    public static int[] populateArray(){
        
        int [] myArray = new int [100];
        
        for(int i=0; i<myArray.length;i++){
            myArray[i] = (int)(Math.random() * 100);
        }
        
        return myArray;
    }
    
    public static void main(String [] args){
        
        LinearSearch test = new LinearSearch();
        
        int [] findArray = populateArray();
        
        System.out.println(Arrays.toString(findArray));
        
        System.out.println("Searching for key = 20 in the array");
        System.out.println(test.sort(20, findArray));
        
        
        
    }
}
