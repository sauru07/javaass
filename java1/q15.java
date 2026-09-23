
import java.util.Scanner;

public class q15 {

    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = inpt.nextInt();
        int count = 0,onum=num, originalNum = num,a=0, c = 0,strongNum=0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        while (originalNum > 0) {
            a = originalNum % 10;
            c = a;
            originalNum = originalNum / 10;
            for (int i = c-1; i > 0; i--) {
                c = c * i;
            }
            strongNum=strongNum+c;
        }
        
        if(onum==strongNum) {
            System.out.println("The entered number is Strong number.");
        } else {
            System.out.println("The entered number is not Strong number.");
        }
    }
}
