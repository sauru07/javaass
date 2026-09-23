
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= inpt.nextInt();
        int a=0,b=0,c=1;

        for(int i=1;i<=n;i++) {
            System.out.print(" "+a);
            a=b+c;
            b=c;
            c=a;
        }
    }
}
