package test;

public class SamePackageAccess {
    public static void main(String[] args) {


    }
    public SamePackageAccess() {

        BaseClass a = new BaseClass();
        a.defaultValue = 2;
        a.protectedValue = 2;
    }

}
