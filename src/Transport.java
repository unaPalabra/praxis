

public class Transport implements Rideable, Swimable{
    protected String type = "None";

    @Override
    public void ride(){
        System.out.println("Riding transport");
    }
}
