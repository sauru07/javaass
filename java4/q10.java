public class q10 {
    public static void main(String[] args) {
        fc obj = new fc();
        obj.showId();
    }
}

class fc {
    int a = 1234;
    void showId() {
        System.out.println("Value of a is : "+this.a);
    }
}