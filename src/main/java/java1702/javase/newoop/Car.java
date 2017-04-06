package java1702.javase.newoop;

/**
 * Created by mingfei.net@gmail.com
 * 4/6/17 09:49
 * JavaSE_20171
 */
public class Car extends Vehicle {

    public Car(String name, double speed, String color) {
        super(name, speed, color);
    }

    public void run() {
        System.out.println("car: " + getName() + " is running...");
    }

    public void stop() {
        System.out.println("car: " + getName() + " stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car("Tom's car", 20d, "black");
        car.run();
        car.stop();
    }
}
