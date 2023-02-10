package Vebinar_OOP.Task_2;

public class Singer implements Musical{
    private final String name;

    public Singer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void greet(){
        System.out.println("Привет, друзья! Я "+ name +"!");
    }

    @Override
    public void play() {
        System.out.println("Не сыпь мне соль на рану,\n" +
                "Не говори на взрыд.\n" +
                "Не сыпь мне соль на рану\n" +
                " она еще болит");

    }
}
