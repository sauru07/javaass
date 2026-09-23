
import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.printf("Entere number : ");
        int num = inpt.nextInt();
        int a = 0, b = 0, count = 0, c = 0;
        int originalNum = num;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        while (originalNum > 0) {
            a = originalNum % 10;
            c = a;
            originalNum = originalNum / 10;
            b = b * 10 + c;
        }
        System.out.printf("The reversed number is %d.", b);
    }
}
