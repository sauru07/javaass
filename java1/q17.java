
public class q17 {

    public static void main(String[] args) {
        boolean isPrime = true;
        for (int i = 2; i < 100; i++) {
            isPrime = true;
            for (int j = 2; j < 10; j++) {
                if (i % j == 0) {
                    if (i == j) {
                        continue;
                    }
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(" " + i);
            }
        }

    }
}
