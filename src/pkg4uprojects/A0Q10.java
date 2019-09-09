/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4uprojects;

import java.util.Scanner;

/**
 *
 * @author marley
 */
public class A0Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        //create boolean to exit the loop
        boolean exitLoop = false;
        
        //while user does not want to exit loop
        while(exitLoop == false){
        //tell user how to exit loop
        System.out.println("You may type 'exit' at any time to stop the program.");
        
        //ask for word, find the length
        System.out.println("Please enter a word.");
        String word = input.nextLine();
        int wordLength = word.length();
        
        //if less than two characters, get new word and length
        while(wordLength < 2){
            System.out.println("There are less than two characters. Please enter a new word.");
            word = input.nextLine();
            wordLength = word.length(); 

        }
        
        //find first and last characters
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(wordLength - 1);
        
        //does user want to quit?
        if (word.equalsIgnoreCase("exit")){
            exitLoop = true;
        //if not, continue and tell them the answer
        } else
        System.out.println("The first letter is " + firstLetter + ". The last letter is " + lastLetter + ".");
        }
    }
    
}
