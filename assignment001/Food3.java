public class Food3 {
    private String foodName;
    private int quantity;

    public Food3(String foodName, int quantity) {
        this.foodName = foodName;
        this.quantity = quantity;
    }

    public void showFood() {
        System.out.println("My favorite food is " + foodName + " and quantity is " + quantity);
    }
}
