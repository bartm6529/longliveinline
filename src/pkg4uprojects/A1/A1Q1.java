/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4uprojects.A1;

/**
 *
 * @author bartm6529
 */
public class A1Q1 {

    //method to find number of bunny ears
    public static int bunnyEars(int n) {
        //base case
        //the 0th bunny is 0
        if (n == 0) {
            return 0;
        }
        //recursive call
        if (n % 2 == 0) {
            //even, add 3
            int num = bunnyEars(n - 1) + 3;
            return num;
        } else {
            //odd, add 2
            int num = bunnyEars(n - 1) + 2;
            return num;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test the code
        int bunnyZero = bunnyEars(0);
        System.out.println("The bunny line at zero bunnies contains " + bunnyZero + " ears.");
        int bunnyOne = bunnyEars(1);
        System.out.println("The bunny line at one bunny contains " + bunnyOne + " ears.");
        int bunnyTwo = bunnyEars(2);
        System.out.println("The bunny line at two bunnies contains " + bunnyTwo + " ears.");
    }

}
