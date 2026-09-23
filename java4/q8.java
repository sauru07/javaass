public class q8 {
    public static void main(String[] args) {
        res ms = new res();
        double aof = ms.aof(5);
        System.out.println("Area of circle : "+aof);
        double aosq = ms.aoSq(5);
    }
}

interface Cmath {
    double PI = 3.14;

    double aof(double a);
}

interface Smath {
    double aoSq(double side);
}

class res implements Cmath, Smath {
    public double aof(double a) {
        return (PI * (a * a));
    }
    public double aoSq(double side) {
        System.out.println("Area of square : "+side*side);
        return 0.00;
    }
}