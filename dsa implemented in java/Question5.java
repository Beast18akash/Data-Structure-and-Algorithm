// print the digits in a number in  reverse order
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int remainder;
        while (num !=0) {
            remainder = num%10;
            System.out.println(remainder);
            num =num/10;

            sc.close();
        }
    }
}
