public class Main {
    public static void main(String[] args) {
        Food1 f1 = new Food1();
        f1.setFoodName("chomchom1");
        f1.setQuantity(5);
        System.out.println("1. Food: " + f1.getFoodName() + ", Quantity: " + f1.getQuantity());

        Food2 f2 = new Food2("chomchom2", 10);
        System.out.println("2. Food: " + f2.getFoodName() + ", Quantity: " + f2.getQuantity());

        Food3 f3 = new Food3("chomchom3", 7);
        System.out.print("3. ");
        f3.showFood();

        Food4 f4 = new Food4("chomchom4", 12);
        System.out.println("4. " + f4);
    }
}
