package Vebinar_OOP.Task_4;

public class Main {
    public static void main(String[] args) {
        Phone sumPhone = new Phone("Samsung", "9138562563");
        Phone miPhone = new Phone("Mi", "9275685241");
        Phone huPhone = new Phone("Huawei", "1234567890");

        miPhone.call(sumPhone);
        huPhone.call(sumPhone);
        miPhone.call(huPhone);
        miPhone.hangCall();
        miPhone.call(huPhone);
    }
}
