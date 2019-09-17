/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4uprojects.A0;

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

        //ask for balance, create starting and ending variables
        System.out.println("Please enter a balance.");
        double startingBalance = input.nextDouble();
        double endBalance = startingBalance;
        //ask for interest rate
        System.out.println("Enter an interest rate");
        double rate = input.nextDouble();
        //year starts at 0
        int year = 0;

        //until the end balance is double the starting balance...
        while (endBalance <= (startingBalance * 2)) {
            //calculate the new end balance
            endBalance = (1 + rate) * endBalance;
            //add to year
            year++;
        }
        //tell them how long it will take
        System.out.println("It will take " + year + " years for the balance to double.");

        //until the end balance is one million dollars
        while (endBalance <= 1000000) {
            //calculate the new end balance
            endBalance = (1 + rate) * endBalance;
            //add to year
            year++;
        }
        //tell them how long it will take
        System.out.println("It will take " + year + " years for the balance to reach a million.");
    }

}
