public class q1 {
    public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 0, 7 };
        int i=0,j=0;
        for ( i = 0; i < arr.length; i++) {
            j=i;
            for ( j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                    }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}