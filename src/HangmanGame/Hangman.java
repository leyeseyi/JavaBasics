
package HangmanGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leyeseyi
 */
//Hangman game that randomly generates a word and prompts the user to guess one letter at a time.
//Each letter in the word is displayed as an asterisk. When the user makes a correct guess, 
//the actual letter is then displayed. When the user finishes a word, displaythe number of 
//misses and ask the user whether to continue to play with another word.
public class Hangman {
    
       
    //method to read file
    public ArrayList<String> getArrayOfWords() throws FileNotFoundException{
        
        //Create an ArrayList
        ArrayList<String> myList = new ArrayList();
        
        //specify file path
        String file = "C:\\Users\\Leyeseyi\\Downloads\\names.txt";
        
        Scanner newFile = new Scanner(new File(file));
        
        while (newFile.hasNext()) {
            String eachWord = newFile.next();
            
            myList.add(eachWord);
		
                        
            }
	
        return myList;
    }
    
    //Randomly select one word from the ArrayList
    public String getWord(ArrayList<String> list){
              
        return list.get((int)(Math.random() * list.size()));
               
    }
    
    //convert word into character array
    public char[] splitWord(String s){
        char [] split = new char [s.length()];
        for(int i=0; i<s.length(); i++){
            
            split[i] = s.charAt(i);
            
        }
        return split;
    }
    
    //method to print asterisk
    public char[] printStars(char[] s){
        
        char [] stars = new char [s.length];
        for(int i=0; i<s.length; i++){
            stars[i] = '*';
        }
        return stars;
    }
    
    public void guess() throws FileNotFoundException{
        
        int wrongGuess=0;
        
        ArrayList<String> words = new ArrayList();
        
        words = getArrayOfWords();
                
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        char j;
        
        String guessedWord = getWord(words);
        
        char [] split = splitWord(guessedWord);
        
        char [] aster = printStars(split);
        
        char [] check = new char [guessedWord.length()]; 
        
        while(!guessedWord.contains(String.valueOf(aster))){
            
            //String asterisk = Arrays.toString(aster);
             System.out.print("(Guess) Enter a letter in the word ");
             System.out.print(aster);
             System.out.print(" > ");
             j = input.next().charAt(0);
             
             //check if string representation of aster already contains j
            if(Arrays.toString(aster).contains(Character.toString(j))){
                System.out.println(j +" has already been entered");
                continue;
            }
                 
            if(guessedWord.contains(Character.toString(j))){
                for(int i=0;i<split.length; i++){
                    if(split[i]==j){
                        aster[i] = j;
                    }
                }
             }
            
            else{
                 System.out.println(j+ " is not in the word");
                 wrongGuess++;
             }
            
//            System.out.println(aster);
            
            if(guessedWord.equals(String.valueOf(aster))){
                
                System.out.print("\nThe word is ");
                System.out.println(aster);
                
                System.out.println("\nYou missed " +wrongGuess+ " time(s)");
                
                System.out.println("Do you want to guess another word? Enter y or n");
                char another = input.next().charAt(0);
                
                anotherGuess(another);
            }
            
        }
        
        
    }
    public void anotherGuess(char d) throws FileNotFoundException{
       if(d == 'y'){
           guess();
       }
       else if(d == 'n')
           System.exit(1);
       else{
           System.out.print("Wrong Input");
        
       }
    }
    
    public static void main(String [] args){
        
        Hangman test = new Hangman();
        try {
            test.guess();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}