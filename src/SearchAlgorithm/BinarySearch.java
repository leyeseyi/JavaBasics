package SearchAlgorithm;

import java.util.Arrays;

/**
 *
 * @author Leyeseyi
 */
public class BinarySearch {
    
    public int[] getArray(){
        
        int [] myArray = new int [1];
        for(int i= 0; i<myArray.length;i++){
            myArray[i]= (int)(Math.random() * 99);
        }
        
        return myArray;
    }
    
    public int[] sortArray(){
        int [] array = getArray();
        
        for(int i =0; i<array.length-1;i++){
            for(int j = i+1; j<array.length;j++){
                int p;
                if(array[i]>array[j]){
                    p = array[j];
                    array[j] = array[i];
                    array[i] = p;
                    
                }
                
            }
        }
        
        return array;
        
    }
    
    public int getValue(int index){
        
        int [] array = sortArray();
        
        int min=0;
        int max=array.length-1;
        
        for(int i=0; i<array.length;i++){
                        
            int value = (int)(min+max)/2;
            
            if(array[index]>array[value]){
                
                min = index+1;
                max = array.length-1;
                //value = (int)(min+max)/2;
            }
            
            else if(array[index]==array[value]){
                System.out.println(Arrays.toString(array));   
                return array[value];
                
            }
            
            else{
                
               max = value-1;
                
            }
        }
        
        System.out.println(Arrays.toString(array));   
        return -min - 1;
    }
    public static void main(String [] args){
        
        BinarySearch test = new BinarySearch();
        System.out.println("Value at index 3 is: " +test.getValue(0));
        
    }
}
