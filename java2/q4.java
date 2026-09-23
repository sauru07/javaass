public class q4 {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,0};
        System.out.println("Before Swapping : ");
        System.out.print("arr1 : ");
        for(int i:arr1) {
            System.out.print(" "+i);
        }
        System.out.print("\narr2 : ");
        for(int i:arr2) {
            System.out.print(" "+i);
        }
        for(int i=0;i<arr1.length;i++) {
            arr1[i]=arr1[i]+arr2[i];
            arr2[i]=arr1[i]-arr2[i];
            arr1[i]=arr1[i]-arr2[i]; 
        }
        System.out.println("\nAfter Swapping :");
        System.out.print("arr1 : ");
        for(int i:arr1) {
            System.out.print(" "+i);
        }
        System.out.print("\narr2 : ");
        for(int i:arr2) {
            System.out.print(" "+i);
        }
    }
}
