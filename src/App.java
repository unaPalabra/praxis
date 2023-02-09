public class App {
    public static void main(String[] args) {
        Car mazda = new Sedan();
//        System.out.println(mazda);

        Car lada = new Sedan("Lada", 80, true, 20.0f
        );
//        System.out.println(lada);
        float mazdaSpeed = mazda.countSpeed(10);
        System.out.println(mazdaSpeed);
        System.out.println(lada.countSpeed(10));


        Baot baot = new Baot();
        Transport transport = new Transport();
        rideSomeTransport(mazda);
        rideSomeTransport(baot);
        rideSomeTransport(transport);

    }

    public static void rideSomeTransport(Rideable rideable) {
        rideable.ride();
    }
}
