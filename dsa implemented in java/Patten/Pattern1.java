// print the reqiured pattern 
// ****

// ***

// **

// *
import java.util.Scanner;;


public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for (int i =1;i <num;i++){
            System.out.println("\n");
            for(int j=num; j >i;j--){
                System.out.print("*");
            }
        }
        scn.close();
    }
}
