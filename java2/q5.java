import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = inpt.nextInt();
        int arr1[]={1,2,3,4,5};
        boolean isPresent = false;
        for(int i:arr1) {
            if (i==num) {
                isPresent = true;
            }
        }
        if (isPresent) {
            System.out.println("Entered number present in array");;
        }else {
            System.out.println("Entered number not present in array");;
        }
    }
}
