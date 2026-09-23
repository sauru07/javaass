
public class q16 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int originalNum = i, num = i, count = 0, digit, a = 0;

            while (num > 0) {
                num = num / 10;
                count++;
            }
            while (originalNum > 0) {
                digit = originalNum % 10;
                originalNum = originalNum / 10;
                int b = 1;
                int tempCnt = count;
                while (tempCnt > 0) {
                    b = b * digit;
                    tempCnt--;
                }
                a = a + b;
            }
            if (a == i) {
                System.out.println(a);
            }
        }
    }
}
