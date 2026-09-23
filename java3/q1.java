public class q1 {
    public static void main(String[] args) {
        String str1 = new  String("Saurabh");
        String str2 = new  String("Shinde");

        if (str1.compareTo(str2)==0) {
            System.out.println("String "+str1+" is equal to "+str2);
        }
        if (str1.compareTo(str2)!=0) {
            System.out.println("String "+str1+" is not equal to "+str2);
        }
    }
}
