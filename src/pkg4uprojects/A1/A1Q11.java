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
        //if the string is one character long (base case)
        if(s.length() == 0){
            return s;
        }
        
        //if the first character is the same as the second...
        if(s.charAt(0) == s.charAt(1)){
            //get rid of the first character
            return stringClean(s.substring(1));
            //if they are different
        } else {
            //return the first character, add the rest of the word
            return s.charAt(0+1) + stringClean(s.substring(2));
        }   
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test the code
        String yyzzza = stringClean("yyzzza");
        System.out.println(yyzzza);

    }
    
}
