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
public class A0Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //create array for inputted number
        int threeNums[] = new int[3];
        
        //ask for the numbers in a loop
        for(int i = 0; i < 3; i++){
            System.out.println("Please input an integer:");
            threeNums[i] = input.nextInt();
        }
        
        //find and state the product of the numbers
        int productNums = threeNums[0] * threeNums[1] * threeNums[2];
        System.out.println("The product is " + productNums);
        
        //find and state the square root of the product
        double squareProd = Math.sqrt(productNums);
        System.out.println("The square root of the product is " + squareProd);
    }
    
}
