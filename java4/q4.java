public class q4 {
    public static void main(String[] args) {
        areaOfCircle cir = new areaOfCircle();
        cir.aoc();
        System.out.println("====================================");
        System.out.println("\tSingle Inheritance");
        System.out.println("\tCircle Radius 5.");
        System.out.println("====================================");
    }
}

class constants {
    final double PI = 3.14;
}

class areaOfCircle extends constants{
    void aoc() {
        double r = 5.0f;
        System.out.println("Area of circle : "+(PI*(r*r)));
    }
}