import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = input.nextInt();
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == a) {
            System.out.println("Entered number is perfect.");;
        } else {
            System.out.println("Entered number is not perfect number.");
        }

    }
}
