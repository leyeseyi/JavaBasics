
import java.util.Scanner;

/**
 *
 * @author Leyeseyi
 */
//This program sorts a string
public class StringSort {
         
    public char[] sort(String s){
        
        char [] myChar = new char[s.length()];
        
        for(int i = 0; i<s.length(); i++){
            myChar[i] = s.charAt(i);
        }
        
        return myChar;
    }
    
    
    public char[] stringSort(char[] s){
        
        String sortName;
        char [] sortChar = new char [s.length];
        for(int i = 0; i<s.length-1; i++){
                
           char word = s[i];
           int index = i;
                
                
                for(int j=i+1; j<s.length; j++){
                    if(word>s[j]){
                        
                        index = j;
                        word = s[j];
                        
                    }
                        
                }
                
                if(index != i){
                    s[index] = s[i];
                    s[i] = word;
                }
            
        
            
     
        }
//        sortName = Arrays.toString(sortChar);
        return s;
    }
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        StringSort test = new StringSort();
        System.out.println("Enter a word: ");
        String j = input.nextLine();
        
       char [] isSort = test.sort(j);
       
  
       
        System.out.println(test.stringSort(isSort));
        
   
    }
    
}
