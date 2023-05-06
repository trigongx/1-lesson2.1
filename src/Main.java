
class Main{
    public static void main(String[] args) {
        Factory factory = new Factory("71063 Sindelfingen","Iron Factory");
        Car car1 = new Car(Color.BLUE,factory,2003);
        System.out.println(car1.getInfo());
        car1.makeSignal();
        car1.makeSignal("Виуууу виууу");
        Mercedes mers1 = new Mercedes(Color.BLACK,factory,2022,"S-class",23000);
        System.out.println(mers1.getInfo());
        mers1.makeSignal();
        mers1.makeSignal("beeeeeeeeeep");
        Mercedes mers2 = new Mercedes(Color.WHITE,factory,2020,"S-class",20000);
        System.out.println(mers2.getInfo());
        mers2.makeSignal();
        mers2.makeSignal("bep bep");

    }
}