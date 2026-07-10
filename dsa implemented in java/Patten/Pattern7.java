/*
Question:
Write a Java program that takes an integer input N and prints
a diagonal line of stars from the top-left to the bottom-right
of an N x N grid. Each star should appear when the row index
equals the column index.

Example:
Input: 5
Output:
*    
 *   
  *  
   * 
    *
*/

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the square grid
        int num = sc.nextInt();

        // Outer loop controls rows
        for (int i = 1; i <= num; i++) {

            // Inner loop controls columns
            for (int j = 1; j <= num; j++) {

                // Print star when row index equals column index
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    // Otherwise print space
                    System.out.print(" ");
                }
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}

