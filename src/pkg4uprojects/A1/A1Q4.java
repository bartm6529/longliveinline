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
public class A1Q4 {

    //method that counts sevens
    public static int count7(int n){
        //if there is nothing left, return 0 (base case)
        if(n % 10 == 0){
            return 0;
        }
        //if there's a 7 in the integer
        if(n % 10 == 7){
            //take one digit off the int and add one to count7
            return count7(n/10) + 1;
        //if there's no 7
        }else{
            //take one off the int, add nothing
            return count7(n/10);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test code
        int sevenOneSeven = count7(717);
        System.out.println(sevenOneSeven);
        int seven = count7(7);
        System.out.println(seven);
        int oneTwoThree = count7(123);
        System.out.println(oneTwoThree);
    }
    
}
