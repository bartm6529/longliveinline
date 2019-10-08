/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4uprojects.A1;

/**
 *
 * @author marley
 */
public class RecursionTest {

    public static String reverse(String s) {
        //base case
        //if the stinrg is one character long
        if (s.length() <= 1) {
            //return said string
            return s;
        }
        
        //add the last letter to the start, then add the rest of the word
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test the code!
        String techie = "Techie";
        System.out.println(reverse(techie));
        String marley = "Marley";
        System.out.println(reverse(marley));
    }

}
