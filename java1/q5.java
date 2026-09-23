import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int i=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        System.out.printf("Factors of %d are ",n);
        while (i<n) {
            if(n%i==0) {
                System.out.printf("%d ",i);
            }
            i++;      
        }
    }
}