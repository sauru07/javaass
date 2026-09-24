import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Math obj =new Math();
        obj.square();
    }
}

final class Math {
    final void square() {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = inpt.nextInt();

        System.out.println("Square : "+(a*a));
    }
}