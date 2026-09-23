import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Add add = new Add();
        Add add1 = new Add(100,289);
        System.out.println("========================\nConstructor overloding\n========================");
    }
}

class Add {
    Add() {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = inpt.nextInt();
        System.out.print("\nEnter first number : ");
        int num2 = inpt.nextInt();
        System.out.println("Sum default constructor: " + (num1 + num2));
    }

    Add(int num1, int num2) {
        System.out.println("Sum parameterized : " + (num1 + num2));
    }
}