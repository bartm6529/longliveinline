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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //What's my age?
        int myAge = 17;
        System.out.println("I am " + myAge);

        //What's my calculated age?
        int calculatedMyAge = 2019 - 2002;
        System.out.println("I am still " + calculatedMyAge);

        //input data using scanner
        Scanner input = new Scanner(System.in);

        //ask more questions
        System.out.println("Please enter your name.");
        String name = input.nextLine();
        System.out.println("How many apples did you take?");
        int numApples = input.nextInt();

        //if statements
        if (numApples > 10) {
            System.out.println("Wow, that's a lot of apples.");
        } else if (numApples > 0 && numApples <= 10) {
            System.out.println("Nice.");
        } else if (numApples == 0) {
            System.out.println("Eat more apples man.");
        } else {
            System.out.println("How the heck do you have negative apples");
        }

        //math operations
        // + : addition
        // - : subtraction
        // * : multiplication
        // / : division
        // Math.pow(base, exponent) : powers
        // Math.sqrt(num) : square root
        // % : modulo/remainder
        // (int)(Math.random()*(max-min+1)+min : random number
        // Math.roudn(num) : round to nearest whole number
        // Math.ceil(num) : rounds up
        // Math.floor(num) : rounds down
        // Math.abs(num) : absolute
        //arrays
        double[] marks = new double[5];
        marks[0] = 76.5;

        //use loop to fill array
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a mark");
            marks[i] = input.nextDouble();
        }

        //while loop
        int count = 0;
        while (count < 5) {
            // read in the mark
            System.out.println("Please enter the mark.");
            marks[count] = input.nextDouble();
            //add to count, move to next spot
            count++;
        }

        //check condition at the end
        //
        do {
            //code goes here
        } while (count < 5);

    }

}
