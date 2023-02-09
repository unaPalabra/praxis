class Cat extends Animal{
    public Cat() {
        //хищник, питается мясом и молоком
        super(false, "milk and meat");
    }
    public void sound(){
        System.out.println("Meow");
    }
}