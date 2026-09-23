import java.util.*;;

public class q3 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = inpt.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.compareTo(rev) == 0) {
            System.out.println("Entered string is palindrome.");
        } else if (str.compareTo(rev) != 0) {
            System.out.println("Entered string is not palindrome.");
        }
    }
}
