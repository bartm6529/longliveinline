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
public class A0Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        //create number to subtract from
        int hundred = 100;
        
        //ask for a number
        System.out.println("Please enter a number between 50 and 100 to stop at.");
        int number = input.nextInt();
        
        //check if between 1 and 10
        while(number < 50 || number > 100){
            System.out.println("Try again. Please enter a number BETWEEN 50 and 100.");
            number = input.nextInt();
        }
        
        do{
            System.out.println(hundred);
            hundred = hundred - 5;
        }while(hundred > number);
    }
    
}
