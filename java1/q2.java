public class q2 {
    public static void main(String[] args) {
        int even=0,odd=0;
        for (int i = 0; i < 21; i++) {
            if(i%2==0) {
                even = even +i;
            }else {
                odd=odd+i;
            }
        }
        System.out.println("Sum of even numbers from 1 to 20 = "+ even);
        System.out.println("Sum of odd numbers from 1 to 20 = "+ odd);
    }
}