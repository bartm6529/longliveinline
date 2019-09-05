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
        
        //create array
        double expenses[] = new double[6];
        expenses[5] = 0;
        
        //ask for the numbers in a loop
        for(int i = 0; i < 5; i++){
            System.out.println("Enter an expense");
            expenses[i] = input.nextInt();
        }
        
        //calculate and state the total
        double sum = 0;
        for (int j = 0; j < 5; j++) {
            sum = expenses[j] + expenses[j+1];
        }
        System.out.println("The total of all expenses is " + sum);
    }
    
}
