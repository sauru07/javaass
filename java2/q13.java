public class q13 {
    public static void main(String[] args) {
        int arr[][][] = {
                { { 2, 1 }, { 3, 2 } },
                { { 5, 7 }, { 6, 5 } },
                { { 32, 45 }, { 32, 22 } }
        };
        for (int k = 0; k < arr.length; k++) {
                System.out.println("Array " + (k+1) + ": ");
            for (int i = 0; i < arr[k].length; i++) {
                for (int j = 0; j < arr[k][i].length; j++) {
                    System.out.print(" " + arr[k][i][j]);
                }
                System.out.println();
            }
        }
    }
}
