public class Customer {
    private String name;
    private  int contact;
    private  double price;

    public Customer (String name, int contact, double price) {
        this.name = name;
        this.contact = contact;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}