/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Prac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create scanner object
        Scanner input = new Scanner(System.in);
         
        // Output the prompt
        System.out.println("Enter a floating point value: ");
         
        // Wait for the user to enter something.
        double value = input.nextDouble();
         
        // Tell them what they entered.
        System.out.println("You entered: " + value);
 
    }
}
