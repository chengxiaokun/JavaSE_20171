/**
 * 交通工具类
 * <p>
 * Created by mingfei.net@gmail.com
 * 3/15/17 14:14
 */
public class Vehicle {
    // 1. fields
    String name;
    double weight; // Kg
    double price; // ￥
    char color;

//    public Vehicle() {
//        System.out.println("Vehicle constructor...");
//    }

    public Vehicle(String name, double weight, double price, char color) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    // 2 methods
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopped.");
    }
}

class Bicycle extends Vehicle {
    String type; // 山地车 公路车 ...

//    public Bicycle(String name, double weight, double price, char color, String type) {
//        super(name, weight, price, color);
//        this.type = type;
//    }

    public Bicycle(String name, double weight, double price, char color, String type) {
        super(name, weight, price, color);
        super.start();
        this.type = type;
    }


//    public Bicycle() {
//        super(); // 调用超类的构造方法 this 指代当前类 super 指代超类
//        super.start(); // 加. 调用超类的成员方法
//    }

    public void ring() { // 按铃
        System.out.println("Bicycle is ringing...");
    }
}

class Ship extends Vehicle {
    double tonnage; // T 排水量

    public Ship(String name, double weight, double price, char color) {
        super(name, weight, price, color);
    }

    public void anchor() {
        System.out.println("Ship is anchor...");
    }
}

class Plane extends Vehicle {
    int engineNumber;

    public Plane(String name, double weight, double price, char color) {
        super(name, weight, price, color);
    }

    public void flying() {
        System.out.println("Plane is flying...");
    }
}

class VehicleTest {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();//("神州六号", 1000, 2000, '白');
//        System.out.println(vehicle.color);
//        vehicle.start();

//        System.out.println("---------------");

        Bicycle bicycle = new Bicycle("Giant", 10, 1000, 'R', "公路车");
        System.out.println(bicycle.name);
        System.out.println(bicycle.type); // ?
//        bicycle.start();
//        bicycle.ring();

//        System.out.println("---------------");

//        Ship ship = new Ship();
//        System.out.println(ship.price);
//        System.out.println(ship.tonnage);
//        ship.stop();
//        ship.anchor();

//        System.out.println("---------------");

//        Plane plane = new Plane();
//        System.out.println(plane.weight);
//        System.out.println(plane.engineNumber);
//        plane.start();
//        plane.flying();
    }
}
