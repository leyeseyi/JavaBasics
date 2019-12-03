/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.Scanner;
    import java.util.Random;
/**
 *
 * @author Leyeseyi
 */
    //The popular scissors rock paper game
public class Scissor_Rock_Paper_Game {
    
    private int computerRandom;
    private int userValue;
    private int value ;
    
    
    public static void main(String [] args){
       Scissor_Rock_Paper_Game test = new Scissor_Rock_Paper_Game();
       test.compare();
       
    }
    
    public int computerRandom(){
       
        Random number = new Random();
        return number.nextInt(3);
    }
    
    public int getUserValue(){
        Scanner input = new Scanner(System.in);
        System.out.println("Scissor(0), Rock(1), Paper(2) ");
        System.out.print("Enter a value: ");
        value = input.nextInt();
        
        return value;
    }
    
    public void compare(){
        int userCount=0;
        int computerCount=0;
        while ((computerCount<2) || (userCount<2)){
            userValue = getUserValue();
            computerRandom();
            computerRandom = computerRandom();
           String user = determineUser(userValue);
           String computer = determineUser(computerRandom);
            if(userValue == computerRandom){

                System.out.println(" You're "+user+ " Computer is " +computer+ "\n It is a draw");
            }
           if(userValue == 0 && computerRandom == 1){
                    System.out.println(" You're "+user+ " Computer is " +computer+ "\n Computer won!");
                    computerCount++;
           }
            if(userValue == 0 && computerRandom == 2){
                    System.out.println(" You're "+user+ " Computer is " +computer+ "\n You won!");
                    userCount++;
           }
             if(userValue == 1 && computerRandom == 2){
                    System.out.println(" You're "+user+ " Computer is " +computer+ "\n Computer won!");
                    computerCount++;
           }
              if(userValue == 1 && computerRandom == 0){
                    System.out.println(" You're "+user+ " Computer is " +computer+ "\n You won!");
                    userCount++;
           }
              if(userValue == 2 && computerRandom == 1){
                    System.out.println(" You're "+user+ " Computer is " +computer+ "\n You won!");
                    userCount++;
           }  
             if(userValue == 2 && computerRandom == 0){
                    System.out.println(" You're "+user+ " Computer is " +computer+ "\n Computer won!");
                    computerCount++;
           }
        }
    }
    
    public String determineUser(int userValue){
         
        if(userValue == 0)
             return "Scissors";
        
         if(userValue==1)
            return "Rock";
       
          return "Paper";
        
    }
   
    
    
    
}
