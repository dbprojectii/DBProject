package model;

public class electronic extends product {

    public electronic(int id, int quantity, String name, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = "Electronics";
    }

    public String toString() {
        return id +
                ":"+
                "Electronic{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
