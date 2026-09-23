
import java.util.Scanner;

public class q13 {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter a Number :");
        long a=1;
        int num = inpt.nextInt();

        for (int i = num; i > 0; i--) {
            a = a*i;
        }
        System.out.println("Factorial of "+num +" is " +a);
    }
}
