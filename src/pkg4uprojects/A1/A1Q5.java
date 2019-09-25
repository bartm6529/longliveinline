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
public class A1Q5 {

    public static String changeXY(String s) {
        //base case
        //if there's no X characters, return original string
        if (!s.contains("x")) {
            return s;
        }
        //if the first character is x...
        if (s.charAt(0) == 'x') {
            //add y to the start of the new word, then add the rest of the old word
            return 'y' + changeXY(s.substring(1));
            //if the first character is not x...
        } else {
            //return said character plus the rest of the old word
            return s.charAt(0) + changeXY(s.substring(1));
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test code
        String codex = changeXY("codex");
        System.out.println(codex);
        String xxhixx = changeXY("xxhixx");
        System.out.println(xxhixx);
        String xhixhix = changeXY("xhixhix");
        System.out.println(xhixhix);
    }

}
