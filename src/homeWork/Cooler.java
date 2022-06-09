package homeWork;


public class Cooler extends Technic implements Printable {
    private int weight;


    public Cooler(int guarantee, int quantity, int price, int weight) {
        super(guarantee, quantity, price);
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println( getClass().getSimpleName()  + "; guarantee: " + getGuarantee()  + " mouth"
                + ", quantity: " + getQuantity() + ", price: " + getPrice() + "$" + ", weight: " + weight + "kg");


    }
}