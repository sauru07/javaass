public class q6 {
    public static void main(String[] args) {
        int matrix[][] = {{2,3},{3,6}};
        int sum =0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
               sum = sum + matrix[i][j];
               System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        } 
        
        System.out.println("The sum of elements of above matrix is : " + sum);
    }
}
