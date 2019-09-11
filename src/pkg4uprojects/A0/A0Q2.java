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
public class A0Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input a scanner
        Scanner input = new Scanner(System.in);
        
        //create array to store the consecutive numbers
        int threeNums[] = new int[3];
        
        //ask for first number
        System.out.println("Please input an integer");
        threeNums[0] = input.nextInt();
        //find the consecutive integers
        threeNums[1] = threeNums[0] + 1;
        threeNums[2] = threeNums[1] + 1;

        //find and state the product of the numbers
        int productNums = threeNums[0] * threeNums[1] * threeNums[2];
        System.out.println("The product of " + threeNums[0] + ", " + threeNums[1] + " and " + threeNums[2] + " is " + productNums);
        
        //find and state the square root of the product
        double squareProd = Math.sqrt(productNums);
        System.out.println("The square root of the product is " + squareProd);
    }
    
}
