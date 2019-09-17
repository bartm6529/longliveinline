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
public class A1Q3 {

    //method to find sum of digits
    public static int sumDigits(int n) {
        //if there is nothing left, return 0 (base case)
        if (n % 10 == 0) {
            return 0;
            //recursive call    
        } else {
            //take one digit off the int, add the digit just taken off
            return sumDigits(n / 10) + n % 10;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test code
        int seventeen = sumDigits(17);
        System.out.println(seventeen);
        int oneTwoSix = sumDigits(126);
        System.out.println(oneTwoSix);
    }

}
