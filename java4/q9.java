public class q9 {
    public static void main(String[] args) {
        fc2 obj = new fc2();
        obj.showId();
    }
}

class fc {
    int a = 1234;
}

class fc2 extends fc {
    int a = 1234;
    void showId() {
        System.out.println("Sum : "+(this.a + super.a));
    }
}