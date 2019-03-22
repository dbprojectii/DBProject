package model;

public class book extends product{

    public book(int id, int quantity, String name, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = "Book";
    }

    @Override
    public String toString() {
        return  id +
                ":"+
                "Book{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

}
