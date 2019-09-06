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
public class A0Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //create tracker for how many years
        int year1 = 0;
        int year2 = 0;
        
        //ask for a balance and interest rate
        System.out.println("Please enter a balance.");
        double initialBalance = input.nextInt();
        double balance = initialBalance;
        System.out.println("Please enter an interest rate.");
        double interest = input.nextInt();
        
        //calculate years until it doubles
        do{
            //add interest rate to balance
            initialBalance = initialBalance + ((initialBalance * interest) / 100);
            //add to year
            year1 ++;
        }while(initialBalance < (initialBalance * 2));
        
        //say how many years until it doubles
        System.out.println("It will take " + year1 + "for the balance to double.");
        
        //calculate years until balance reaches a million dolars
        do{
            //add interest rate to balance
            balance = balance + ((balance * interest) / 100);
            //add to year
            year2 ++;
        }while(balance < 1000000);
        
        //say how many years until it reaches 1 million
        System.out.println("It will take " + year2 + "for the balance to reach 1 million.");
        
    }
    
}
