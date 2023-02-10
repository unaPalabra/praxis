package Vebinar_OOP.Task_3;

public class Auto {
    private String brand;
    private Engine engine;
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private Body body;

    public Auto(String brand, String color, Wheel wheel) {
        this.engine = new Engine();
        this.body = new Body(color);
        this.brand = brand;
        this.wheel = wheel;
        this.steeringWheel = new SteeringWheel(this.wheel);

    }

    public void turnRight(){
        steeringWheel.turnRight();
        System.out.println("Машина повернула направо.");
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;

        steeringWheel.setWheel(this.wheel);
    }
}
