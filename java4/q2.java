public class q2 {
    public static void main(String[] args) {
        Add add = new Add(10,20);
        System.out.println("==============\nParameterized\n==============");
    }    
}

class Add {
    Add(int num1,int num2) {
        System.out.println("Sum : "+(num1+num2));
    }
}