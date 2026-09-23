import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        int count =0;
        Scanner inpt = new Scanner(System.in);
        String vowels[] = {"a","e","i","o","u"};
        System.out.print("Enter a string : ");
        String str = inpt.nextLine();
        for(int i=0; i<vowels.length;i++) {
            if (str.contains(vowels[i].trim())) {
               count++;
            }
        }
        System.out.println("Count of vowels : "+ count);
    }
}
