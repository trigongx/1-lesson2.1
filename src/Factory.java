public class Factory {
    private String address;
    private String name;

    public Factory(String address,String name) {
        this.address = address;
        this.name = name;
    }

    public Factory() {
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
