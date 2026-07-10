/*
Question:
Write a Java program that takes an integer input N and prints
a diagonal line of stars from the top-right to the bottom-left
of an N x N grid. Each star should appear when the sum of the
row index and column index equals N + 1.

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

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the square grid
        int num = sc.nextInt();

        // Outer loop controls rows
        for (int i = 1; i <= num; i++) {

            // Inner loop controls columns
            for (int j = 1; j <= num; j++) {

                // Print star when row + column equals num + 1
                if (i + j == num + 1) {
                    System.out.print("*\t");
                } else {
                    // Otherwise print tab space
                    System.out.print("\t");
                }
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}

