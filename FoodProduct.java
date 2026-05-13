package supermarketcashiersystem;

// Inheritance: FoodProduct inherits all attributes from Product
public class FoodProduct extends Product {
    
    // Encapsulation: Specific attribute for food items only
    private String expirationDate;

    public FoodProduct(String name, double price, String barcode, String expirationDate) {
        // Reusability: Calling the parent class constructor
        super(name, price, barcode); 
        this.expirationDate = expirationDate;
    }
    
    // Getter: Providing controlled access to the private field
    public String getExpirationDate() {
        return expirationDate;
    }
}

