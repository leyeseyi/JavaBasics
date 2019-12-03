

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */
public class Statamic {
    
    
        
    public static void main(String [] args){
        
        //Create a list 
       List<String> cars = new ArrayList<>(); 
       
       
        //declaring array list 
              
       cars.add("Bike");
       cars.add("flakes");
       cars.add(1, "rolls");
       
        
     //methods
        System.out.println("cars: " +cars);
        
        //retrieving from an array
        System.out.println("Cars: " +cars.get(0));
        
        cars.set(0, "Olaleye");
        System.out.println("New cars: " +cars);
        
        //to remove from a list
       cars.remove("rolls");
       
       //convert array list to array
       Object [] carsToArray = cars.toArray();
       
       
       //LINKED LIST
       List linked = new LinkedList();
       
       
       //add
       linked.add("Added");
       
       
       
       //LOOPS
       for(int i = 0; i<cars.size(); i++){
           System.out.println("Element: " +cars.get(i));
       }
       
       //Another way to get is using Iterator
       Iterator LIter = cars.iterator();
       while(LIter.hasNext()){
           System.out.println("LIter: "+ LIter.next());
       }
    }
}
