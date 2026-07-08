import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sp= num/2;
        int str=1;
        for(int i =1;i<=num;i++){
            for(int j = 1;j<=sp;j++){
                System.out.print("\t");
            }
            for( int k=1;k<=str;k++){
                System.out.print("*\t");
            }
            if( i<=num/2){
                sp--;
                str += 2;
            }else{
                sp++;
                str -= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
