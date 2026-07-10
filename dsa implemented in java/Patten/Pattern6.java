/*
Question:
Write a Java program that takes an integer input N and prints
a symmetric star pattern with spaces in the middle. The stars
decrease on each side while spaces increase until halfway, then
reverse to form an hourglass-like shape.

Example:
Input: 7
Output:
**** ****
***    ***
**      **
*        *
**      **
***    ***
**** ****
*/

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of rows from user
        int num = sc.nextInt();

        // sp = spaces in the middle, st = stars on each side
        int sp = 1;
        int st = (num / 2) + 1;

        // Outer loop controls the number of rows
        for (int i = 1; i <= num; i++) {

            // Print left stars
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int k = 0; k < sp; k++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.print("\n");

            // Adjust stars and spaces depending on row position
            if (i <= num / 2) {
                st--;        // decrease stars
                sp += 2;     // increase spaces
            } else {
                st++;        // increase stars
                sp -= 2;     // decrease spaces
            }
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}


