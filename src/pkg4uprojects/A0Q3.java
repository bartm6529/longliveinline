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
public class A0Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //create array to store expenses
        double expenses[] = new double[5];
        
        //ask for the expenses in a loop and store them in the array
        for(int i = 0; i < 5; i++){
            System.out.println("Enter an expense");
            expenses[i] = input.nextDouble();
        }
        
        //calculate the total expenses by adding together
        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum = sum + expenses[i];
        }
        //state the total
        System.out.println("The total of all expenses is " + sum);
        
        //find and state how many tickets you need
        double tickets = Math.ceil(sum / 35);
        System.out.println("You need to sell " + tickets + " tickets.");
    }
    
}
