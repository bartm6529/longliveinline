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
public class A1Q11 {
    
    public static String stringClean(String s){
        //Return original string if there's less than two characters (base case)
        if(s.length() < 2){
            return s;
        }
        //if the two first characters are different
        if(s.charAt(0) != s.charAt(1)){
            //return the original string, moving one character over
            return s.charAt(0) + stringClean(s.substring(1));
            //if not
        } else {
            //return a new string, getting rid of the first character
            return stringClean(s.substring(1));
        } 
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test the code
        String yyzzza = stringClean("yyzzza");
        System.out.println(yyzzza);
        
        String abbbcdd = stringClean("abbbcdd");
        System.out.println(abbbcdd);
        
        String hello = stringClean("Hello");
        System.out.println(hello);
 


    }
    
}
