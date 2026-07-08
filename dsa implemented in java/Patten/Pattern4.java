/*
Question:
Write a Java program that takes an integer input N and prints
a pattern of stars in decreasing order, aligned with spaces.

Example:
Input: 5
Output:
*****
 ****
  ***
   **
    *
*/

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of rows from user
        int num1 = sc.nextInt();

        // num2 and num3 are used to control spacing
        int num2 = num1;
        int num3 = num1;

        // Outer loop controls the number of rows
        for (int i = 1; i <= num3; i++) {
            
            // Print stars for the current row
            for (int j = 1; j <= num1; j++) {
                System.out.print("*");
            }

            // Decrease star count for next row
            num1--;

            // Move to next line
            System.out.print("\n");

            // Print spaces before stars in next row
            for (int k = num3; k >= num2; k--) {
                System.out.print(" ");
            }

            // Decrease spacing control
            num2--;
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}
