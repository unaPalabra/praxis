public class Main {
    int ads, fgt;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        cat.getEats();
    }

    public int getAds() {
        return ads;
    }

    public void setAds(int ads) {
        this.ads = ads;
    }
}
