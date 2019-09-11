package pkg4uprojects.A1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bartm6529
 */
public class A1Q2 {
    //Method to find the number of blocks in a row
    public static int triangle(int n){
        //the 1st row (base case)
        if (n == 0) {
            return 0;
        }
        //recursive call
        int num = triangle(n-1) + 1;
        //return the number
        return num; 
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test the code
        int triangleZero = triangle(0);
        System.out.println("The 0th row has " + triangleZero + " blocks.");
        int triangleOne = triangle(1);
        System.out.println("The 1st row has " + triangleOne + " blocks.");
        int triangleTwo = triangle(2);
        System.out.println("The 2nd row has " + triangleTwo + " blocks.");
    }
    
}
