public abstract class Car extends Transport {
    public String brand;
    public int horsePower;
    public boolean isAwd;
    float acceleration;

    public Car() {
        brand = "Mazda";
        horsePower = 100;
        isAwd = false;
        acceleration = 10;
        type = "Car";
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }

    public abstract void start();

    //    public void start(){
//       System.out.println(brand + " was started");
//   }
    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getAcceleration() {
        return acceleration;
    }

    @Override
    public String toString() {
        return "brand = " + brand + "\n"
                + "horsepower = " + horsePower + "\n"
                + "isAwd = " + isAwd + "\n"
                + "acceleration = " + acceleration;
    }

    public float countSpeed(float time) {
        return (100 / acceleration) * time;
    }

    @Override
    public void ride() {
        System.out.println("Riding car");
    }
}
