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
        
        //ask for balance
        System.out.println("Please enter a balance.");
        double initialBalance = input.nextDouble();
        double endBalance = 0;
        double interest;
        int year = 0;
        
        //ask for interest rate
        System.out.println("Please enter an interest rate in decimal form");
        interest = input.nextDouble();
        
        do{
            endBalance = (1 + interest) * initialBalance;
            year++;
        }while(endBalance <= (initialBalance * 2));
        
        System.out.println(year);
    }
    
}
