
import java.util.Scanner;

public class q12 {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = inpt.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        if (isPrime == true) {
            System.out.println("The entered number is prime.");
        } else {
            System.out.println("The entered number is not prime.");
        }
    }
}
