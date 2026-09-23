
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        // making new input object
        Scanner sc = new Scanner(System.in);

        //declearing variables
        int empId;
        String empName;
        float empSalary;
        long empMobile;

        //Taking input
        System.out.print("Enter employee id : ");
        empId = sc.nextInt();
        System.out.print("Enter employee Name : ");
        empName = sc.next();
        System.out.print("Enter employee Salary : ");
        empSalary = sc.nextFloat();
        System.out.print("Enter employee number : ");
        empMobile = sc.nextLong();

        //writing all details of employee
        System.out.println("Employee Details >>");
        System.out.println("Employee Id : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Salary : "+empSalary);
        System.out.println("Employee Contact Number : "+empMobile);
    }
}
