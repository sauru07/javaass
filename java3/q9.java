import java.util.Arrays;

public class q9 {
    public static void main(String[] args) {
        String str = new String("String.  ");
        System.out.println("Main string : "+ str);
        System.out.println("Chat at index 2 : "+str.charAt(2));
        System.out.println("Length : "+str.length());
        System.out.println("Substring : "+str.substring(0,2));
        System.out.println("Equal : "+str.equals("String"));
        System.out.println("IsEmpty"+ str.isEmpty());
        System.out.println("Concat :"+str.concat(" is String"));
        System.out.println("Replace :"+str.replace('a','s'));
        System.out.println("Equals ignoring case :"+str.equalsIgnoreCase("string"));
        System.out.println("Split :"+Arrays.toString(str.trim().split("")));
        System.out.println("Tolowercase :"+str.toLowerCase());
        System.out.println("To uppercase :"+str.toUpperCase());
        System.out.println("Trim :"+str.trim());
    }
}
