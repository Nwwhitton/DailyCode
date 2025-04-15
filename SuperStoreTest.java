// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
class Product{
    // - A protected String field called name
    protected String name;

    // - A protected double field called price
    protected double price;

    // - A private final int productId
    private final int productId;

    // - A public static int nextId to help generate unique IDs
    public static int nextId = 1;

    // - A constructor that sets name, price, and assigns a unique ID
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.productId = nextId;
        nextId++;
    }
    // - Public getters for all fields
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getProductId(){
        return this.productId;
    }

    // - Override toString() to return formatted product details
    @Override
    public String toString(){
        return "Name: " + name + "\nPrice: " + price + "\nProduct ID: " + productId;
    }

    // - Override equals(Object o) to compare name and productId
    @Override
    public boolean equals(Object o){
        return this == o;
    }
}

// TODO: Define a subclass Electronics that extends Product
class Electronics extends Product {

    // - Add a private String field called brand
    private String brand;

    // - Add a private boolean field called hasBattery
    private boolean hasBattery;

    // - Constructor takes all fields and uses super for shared ones
    public Electronics(String name, double price, String brand, boolean hasBattery){ //Public, because it has the least restrictions
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }

    // - Override toString() to include brand and battery status
    @Override
    public String toString(){ //Public, because it has the least restrictions
        return "Name: " + name + "\nPrice: " + price + "\nProduct ID: " + getProductId() +
                "\nBrand: "+ brand + "\nHas Battery: " + hasBattery;
    }


    // 3. Add a method to Electronics called warrantyInfo() and mark it final
    final String warrantyInfo() {
        return "Here's the warranty info";
    }

}


// TODO: Define a subclass Grocery that extends Product
class Grocery extends Product {

    // - Add a private double field called weight (in kg)
    private double weight;

    // - Add a private boolean field called isPerishable
    private boolean isPerishable;


    // - Constructor takes all fields and uses super for shared ones
    public Grocery(String name, double price, double weight, boolean isPerishable) { //Public, because it has the least restrictions
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }

    // - Override toString() to include weight and perishability
    @Override
    public String toString(){ //Public, because it has the least restrictions
        return "Name: " + name + "\nPrice: " + price + "\nProduct ID: " + getProductId() +
                "\nWeight: "+ weight + "\nPerishable: " + isPerishable;
    }
}


// TODO: Define a final class Toy that extends Product
final class Toy extends Product {
    // - Add a private int field called minAge
    private int minAge;

    // - Constructor takes all fields and uses super for shared ones
    public Toy(String name, double price, int minAge) { //Public, because it has the least restrictions
        super(name, price);
        this.minAge = minAge;
    }

    // - Override toString() to include minAge
    @Override
    public String toString(){ //Public, because it has the least restrictions
        return "Name: " + name + "\nPrice: " + price + "\nProduct ID: " + getProductId() +
                "\nMinimum Age: "+ minAge;
    }
}

// TODO: Define class SuperStoreTest with a main method
public class SuperStoreTest { //Public, because this is the file name

    public static void main(String[] args) {

        // - Create at least one instance of each subclass
        Electronics e1 = new Electronics("Switch 2", 449.99, "Nintendo", true);
        Grocery g1 = new Grocery("Kiwi", 7.47, 0.069, true);
        Toy t1 = new Toy("Stretch Armstrong", 24.99, 3);



        // - Store them in a Product[] array
        Product[] ProductArray = {e1, g1, t1};

        // - Loop through and print each item
        for (int i = 0; i < ProductArray.length; i++) {
            System.out.println(ProductArray[i].toString());
            System.out.println();
        }
        // - Call equals() to compare two products with the same ID and name
        System.out.println("e1 has the same object as e1 so that's why it is: " + e1.equals(e1));
        System.out.println();
        double discount = Coupon.discountRate;
        e1.price -= e1.price*discount;

        System.out.println("e1 with discount");
        System.out.println(e1.toString());
    }
}


// Additional TODOs:
// 1. Try to extend Toy — what happens and why?

//class BouncyBalls extends Toy {
//    // Toy is not allowed to be extended from, because Toy is final
//}

// 2. Make a class Coupon with a final discountRate and apply it to a Product
class Coupon {
    final static double discountRate = .3; //static, so it could be accessed everywhere
}

// 4. Use access modifiers appropriately and explain your choices in comments
