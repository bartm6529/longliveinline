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
public class A0Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input a scanner
        Scanner input = new Scanner(System.in);
        
        //ask for a word
        System.out.println("Please enter a word");
        String word = input.nextLine();
        //find length of the word
        int wordLength = word.length();
        //create count variable
        int count = 0;
        
        //repeat loop for as many letters in the word
        for (int i = 0; i < wordLength; i++) {
            //add to letter count
            count++;
        }
        
        //tell user how long the word is
        System.out.println("There are " + count + " letters in this word.");
    }
    
}
