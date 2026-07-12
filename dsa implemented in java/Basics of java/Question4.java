// print the digits in a number
import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int temp = n;
       int nod = 0;
       while (temp !=0) {
        temp = temp/10;
        nod++;

       }
       int result;
    int div = (int)Math.pow(10, nod-1);
       while (div != 0) {
        result = n/div;
        System.out.println(result);
        n = n%div;
       
        div = div/10;
         
        
       }
       sc.close();
    }
}