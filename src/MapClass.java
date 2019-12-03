
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */
public class MapClass {
    public static void main (String... args){
    
        Map <String, String> cars = new TreeMap();
        
        //add content to the map
        cars.put("Nigeria", "+234");
        cars.put("Ghana", "+235");
        cars.put("Togo", "+236");
        cars.put("Ghana", "+235");
        
        //display element
        System.out.println("Map: " +cars);
        
        //display map elements
        //First: COnvert to a set
        
        Set < Map.Entry<String,String>> entrySet = cars.entrySet();
        
        //Print from a set
        for(Map.Entry<String, String> entry : entrySet){
            System.out.print("Key: "+ entry.getKey());
            System.out.print(", Value: " + entry.getValue());
            System.out.println(" ");
        }
        
        //Get zip code for nigeria
        System.out.println("Zip code for Nigeria: " + cars.get("Nigeria"));
    }
}
