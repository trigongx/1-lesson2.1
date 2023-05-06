public class Car extends Factory{
    private Color color;
    private Factory factory;
    private int year;

    public Car(String address, String name, Color color,
               Factory factory, int year){
        super(address,name);
        this.color = color;
        this.factory = factory;
        this.year = year;
    }
    public Car(Color color,Factory factory,int year){
        this.color = color;
        this.factory = factory;
        this.year = year;
    }


    public Color getColor() {
        return color;
    }

    public Factory getFactory() {
        return factory;
    }

    public int getYear() {
        return year;
    }

    public String getInfo(){
        return "Factory name " + factory.getName() +
                "\nFactory address " + factory.getAddress() +
                "\nColor " + color +
                "\nYear " + year;
    }

    public final void makeSignal(){
        System.out.println("Beep beep");
    }
    public void makeSignal(String signal){
        System.out.println(signal);
    }
    }

