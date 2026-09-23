public class q8 {
    public static void main(String[] args) {
        int m1[][] = { { 4, 3 }, { 5, 2 } };
        int m2[][] = { { 8, 3 }, { 9, 0 } };
        int sumArr[][] = new int[2][2];
        System.out.println("First matrix : ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                System.out.print(" " + m1[i][j]);
                ;
            }
            System.out.println();
        }
        System.out.println("Second matrix : ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                System.out.print(" " + m2[i][j]);
            }
            System.out.println();
        }
        System.out.println("Result of sum of above matrices : ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                sumArr[i][j] = m1[i][j] + m2[i][j];
                System.out.print(" " + sumArr[i][j]);
            }
            System.out.println();
        }
    }
}
