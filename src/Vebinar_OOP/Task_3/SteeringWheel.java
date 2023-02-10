package Vebinar_OOP.Task_3;

public class SteeringWheel {
    private Wheel wheel;

    public SteeringWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void turnRight(){
        System.out.println("Руль повернули направо.");
        wheel.turnRight();
    }
}
