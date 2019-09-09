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
public class A0Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //ask for name
        System.out.println("What is your name?");
        String name = input.nextLine();
        
        //tell them their name
        System.out.println("Hello " + name + "!");
    }
    
}
