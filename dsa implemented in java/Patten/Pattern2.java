/*
Problem Statement:
Write a Java program that takes an integer input 'num' and prints a right-angled 
triangle pattern of stars (*) with 'num - 1' rows. 
For example, if the input is 5, the output should be:

*
**
***
****

*/

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scn = new Scanner(System.in);

        // Read an integer value from the user
        int num = scn.nextInt();

        // Outer loop controls the number of rows (from 1 to num-1)
        for (int i = 1; i < num; i++) {
            // Print a new line before starting each row
            System.out.println();

            // Inner loop prints stars equal to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }

        // Close the scanner to avoid resource leaks
        scn.close();
    }
}

