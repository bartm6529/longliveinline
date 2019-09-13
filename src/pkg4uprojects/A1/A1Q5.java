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

    public static String changeXY(String s){
        //If there's no X characters, return original string (base case)
        if(!s.contains("x")){
            return s;  
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
