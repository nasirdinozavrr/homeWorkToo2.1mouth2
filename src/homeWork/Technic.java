package homeWork;

public abstract class Technic {
    private int guarantee;
    private int quantity;
    private int price;

    public Technic(int guarantee, int quantity, int price) {
        this.guarantee = guarantee;
        this.quantity = quantity;
        this.price = price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}