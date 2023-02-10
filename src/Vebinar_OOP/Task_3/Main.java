package Vebinar_OOP.Task_3;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Lada", "Blue", new Wheel("Tommy"));
        auto.turnRight();

//        Прокалываем колесо "Tommy" и меняем
        auto.setWheel(new Wheel("Polly"));
        auto.turnRight();

//        Меняем имя у колеса, не само колесо:

        auto.getWheel().setName("Groovy");
        auto.turnRight();
    }
}
