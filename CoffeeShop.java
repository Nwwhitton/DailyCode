import java.sql.SQLOutput;

public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        // Use a different constructor each time
        CoffeeOrder coffee1 = new CoffeeOrder();
        CoffeeOrder coffee2 = new CoffeeOrder("Large");
        CoffeeOrder coffee3 = new CoffeeOrder("Extra large", "Americano");


        // TODO 3: Call describeOrder() on each and print the result
        System.out.println(coffee1.describeOrder());
        System.out.println(coffee2.describeOrder());
        System.out.println(coffee3.describeOrder());


        // TODO 4: Print the total number of orders using
        System.out.println("Total number of orders: "+ CoffeeOrder.getTotalOrders());
    }
}
