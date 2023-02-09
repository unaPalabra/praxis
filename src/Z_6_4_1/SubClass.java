package Z_6_4_1;

public class SubClass extends SuperClass {

    SubClass(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public int add(int v) {
        return super.add(v) + a;
    }

    public static void main(String args[]) {
        SuperClass f =new SuperClass(50);
        SubClass s = new SubClass(10, 12);
        System.out.println(s.a);
        System.out.println(f.a);

        System.out.println(s.add(5));
        System.out.println(f.add(5));

    }
}

