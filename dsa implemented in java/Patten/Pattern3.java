/*
Question:
Write a Java program that takes an integer input N and prints
a right-aligned triangle of stars with N rows.

Example:
Input: 5
Output:
    *
   **
  ***
 ****
*****
*/

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); // number of rows
        
        // Outer loop controls rows
        for (int j = 1; j <= num; j++) {
            
            // Print spaces first
            for (int i = j; i < num; i++) {
                System.out.print(" ");
            }
            
            // Then print stars
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            
            // Move to next line
            System.out.println();
        }
        
        sc.close();
    }
}

