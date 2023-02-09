package Z_6_2_4;

public class Zombie extends Monster {
    public Zombie() {
        super( "the Zombie",5);

    }
//@Override
    public void growl(){

        System.out.print("Raaaauuughhhh");
        super.growl();
    }
}
