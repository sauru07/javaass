

public class q18 {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            int num=i, a = 0, b = 0, count = 0, c = 0, revNum = num;
            int originalNum = num;

            while (num > 0) {
                num = num / 10;
                count++;
            }
            while (originalNum > 0) {
                a = originalNum % 10;
                c = a;
                originalNum = originalNum / 10;
                b = b * 10 + c;
            }
            if (revNum == b) {
                System.out.print(" "+i);
            }
        }
    }
}
