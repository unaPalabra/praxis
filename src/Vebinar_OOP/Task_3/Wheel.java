package Vebinar_OOP.Task_3;

public class Wheel {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public void turnRight(){
        System.out.println("Колесо "+name+" поварачивается направо");
    }

    public void setName(String name) {
        this.name = name;
    }
}
