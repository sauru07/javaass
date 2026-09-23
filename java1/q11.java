
import java.util.Scanner;

public class q11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();
        int cnum = num, count = 0, originalNum = num;
        System.out.println(num+" Is the entered Number.");
        while (cnum > 0) {
            cnum = cnum / 10;
            count++;
        }
        int arr[] = new int[count];
        for (int i = 0; i < count; i++) {
            if (i > count) {
                break;
            }
            arr[i] = originalNum % 10;
            originalNum = originalNum / 10;
        }
        for(int i=count-1;i>0;i--){
            System.out.println(arr[i]+" is the fave value "+arr[i]);
        }
    }
}
