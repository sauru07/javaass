public class q3 {
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,6,7,8,4,3,5};
        int count=0;
        for(int i:arr) {
            i= i-1;
            count++;
        }
        System.out.println("Size of array is : "+count);
    }
}
