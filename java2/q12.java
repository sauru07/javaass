public class q12 {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {6,5,7,6,5},
            {32,45,32,22,}
        };
        for(int i=0;i<arr.length;i++) {
            System.out.println("Array "+i+": ");
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
