import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Student std = new Student();
        std.takeInput();
        std.show();
    }
}

class std1 {
    int rollNO;
    double marks;

}
class std2 extends std1{
    String name;
}

class Student extends std2 {
    void takeInput() {
        Scanner inpt = new  Scanner(System.in);
        System.out.print("\nEnter Roll number :");
        this.rollNO = inpt.nextInt();

        System.out.print("\nEnter Marks :");
        this.marks = inpt.nextDouble();

        System.out.print("\nEnter Name :");
        inpt.nextLine();
        this.name = inpt.nextLine();
    }

    void  show() {
        System.out.println("Name : "+this.name);
        System.out.println("Roll no :"+this.rollNO);
        System.out.println("Marks : "+this.marks);
    }
}