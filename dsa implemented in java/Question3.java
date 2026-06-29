// print how many digits are present in a number
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int count =0;
        while (num1 >0){
            num1 = num1/10;
            count = count+1;
        }
        System.out.println(count);
        sc.close();
    }
}
