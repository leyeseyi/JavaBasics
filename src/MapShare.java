
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leyeseyi
 */
public class MapShare {
    
    public static void main (String [] args){
        MapShare test = new MapShare();
        test.mapTest("aa", "ccc");
    }
    public void mapTest(String a, String b){
        Map <String, String> mapShare = new TreeMap();
        mapShare.put(a, b);
        if(mapShare.containsKey("c") || mapShare.containsValue("c") || mapShare.containsKey("cc") || mapShare.containsValue("cc")|| mapShare.containsKey("ccc") || mapShare.containsValue("ccc"))
            mapShare.remove(b, a);
        
         Set < Map.Entry<String,String>> entrySet = mapShare.entrySet();
        
        //Print from a set
        for(Map.Entry<String, String> entry : entrySet){
            System.out.print(entry.getKey() +" ");
            System.out.print(entry.getValue()+" ")  ;
            System.out.println(" ");
        }
    }
}
