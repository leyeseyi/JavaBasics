
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */
public class ExceptionalTwo {
    
    
    public static Object getIndex(int index, ArrayList list){
        if(list.size()>0){
            
            //check index
            if(index<list.size()-1)
                return list.get(index);
        }
            throw new IndexOutOfBoundsException("Element does not exist");
    }
    public static void main(String [] args){
        
        ArrayList flowers = new ArrayList();
        
        flowers.add("tulips");
        flowers.add("daisies");
        flowers.add("rose");
        flowers.add("lavender");
        
        
        
        try{
        
            System.out.println("Element at index 2: " +getIndex(7,flowers));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            
        }
        
        System.out.println("I love flowers");
               
    }
}
