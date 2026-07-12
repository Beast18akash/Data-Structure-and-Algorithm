// print the factorization of a given number

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
 for (int i =2; i <Math.sqrt(num1);i++){
  while ( num1%i ==0) {
    num1 = num1/i;
    System.out.println(i);
  }
 }
 if (num1 != 1){
System.out.println(num1);
 }
 sc.close();
    }
  }