/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4uprojects;

import java.util.Scanner;

/**
 *
 * @author bartm6529
 */
public class A0Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create variable for population and year
        double population = 6;
        int year = 1999;
        
        //repeat until the population exceeds 10 billion, (or 10)
        do{
            //what's 1.4% of the population? Add it to the last years population
            population = population + ((population * 1.4) / 100);
            //add to year
            year ++;
        }while(population < 10);
        
        //tell user what year it will be...
        System.out.println("It will be " + year + " when the population exceeds 10 billion");
    }
    
}
