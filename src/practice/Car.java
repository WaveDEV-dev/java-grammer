package practice;

public class Car {
    String model;
    int power;
    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public void go() {
        System.out.println(model + "go");
    }

    public void alert() {
        System.out.println(power + " alert " + model);
    }

    public void accelerate(int accel) {
        power = power + accel;
    }
}
