package Z_6_3_1;

public class Main {
    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        alphabet.setW(5);
        System.out.println(alphabet.getSum());
        alphabet.setA(5);
        alphabet.setS(7);
        alphabet.setD(7);
        System.out.println(alphabet.getSum());
    }
}
