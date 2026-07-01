// print the inverse of  a number 
// eg: 21453 should give 23154
// if 5 digits are present in a number than, all digits from one to five must be present
import java.util.Scanner;
/**
 * Question6
 */
public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int counter =0;
       int finalresult= 0;
       int position;
       while (num !=0) {
        position =num%10;
        num = num/10;
        counter++;
        finalresult += (int)Math.pow(10, position-1) * counter;
       }
       System.out.println(finalresult);
       sc.close();
    }
}