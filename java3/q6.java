import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter a character :");
        String ch = inpt.next().trim();
        System.out.print("\nEnter a String :");
        inpt.nextLine();
        String str = inpt.nextLine().trim();

        String newStr[] = new String(str).split(ch);
        System.out.println(Arrays.toString(newStr));
    }

}