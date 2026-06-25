//print the n fibonacci numbers

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        for (int i =1;i<=num;i++){
            System.out.println(num1);
            sum = num1+num2;
            num1 =num2;
            num2 = sum;

            src.close();
        }
    }
}
