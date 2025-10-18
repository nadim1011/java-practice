public class Food4 {
    private String foodName;
    private int quantity;

    public Food4(String foodName, int quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "My food name is " + foodName + " and quantity is " + quantity;
    }
}
