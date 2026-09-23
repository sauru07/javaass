public class q7 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info("Four wheeller", "Nexa","Blue", "7 s");
        car.show();
        bike bk = new bike();
        bk.info("Two wheeller", "Royal","Black", "2 s");
        bk.show();
    }
}

class Vehical{
    String type;
    String name;
    String color;
    String capacity;
}
class Car extends Vehical {
    void info(String type,String name,String color,String capacity) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.capacity= capacity;
    }
    void show() {
        System.out.println("Color : "+this.color);
        System.out.println("Name : "+ this.name);
        System.out.println("Color : "+this.color);
        System.out.println("Capacity : "+this.capacity);
    }
}
class bike extends Car {
    void info(String type,String name,String color,String capacity) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.capacity= capacity;
    }
    void show() {
        System.out.println("Color : "+this.color);
        System.out.println("Name : "+ this.name);
        System.out.println("Color : "+this.color);
        System.out.println("Capacity : "+this.capacity);
    }
}
