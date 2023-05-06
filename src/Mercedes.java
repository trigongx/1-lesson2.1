public final class Mercedes extends Car{
    private String model;
    private int price;

    public Mercedes(String address, String name, Color color, Factory factory, int year, String model, int price) {
        super(address, name, color, factory, year);
        this.model = model;
        this.price = price;
    }

    public Mercedes(Color color, Factory factory, int year, String model, int price) {
        super(color, factory, year);
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nModel " + model +
                "\nPrice " + price;
    }
}
