import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String ch = inpt.nextLine().trim();

        int digitCount = 0, symbolCount = 0, charCount = 0;

        for (int i = 0; i < ch.length(); i++) {

            if ((ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z') ||
                (ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z')) {
                charCount++;
            }

            if (ch.charAt(i) >= '0' && ch.charAt(i) <= '9') {
                digitCount++;
            }

            if (!((ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z') ||
                  (ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z') ||
                  (ch.charAt(i) >= '0' && ch.charAt(i) <= '9'))) {
                symbolCount++;
            }
        }

        System.out.println("The count of characters is : " + charCount);
        System.out.println("The count of symbols is : " + symbolCount);
        System.out.println("The count of digits is : " + digitCount);
    }
}