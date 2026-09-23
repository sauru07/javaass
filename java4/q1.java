import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println("==============\n    Default\n==============");
    }    
}

class Add {
    Add() {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = inpt.nextInt();
        System.out.print("\nEnter first number : ");
        int num2 = inpt.nextInt();
        System.out.println("Sum : "+(num1+num2));
    }
}