
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int i=1,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        while(i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.printf("Sum of first %d number is %d",n,sum);
    }
}
