package supermarketcashiersystem;

public class Product {
    // 1. ENCAPSULATION: Protect data using private access modifiers
    private String name;
    private double price;
    private String barcode;

    // 2. CONSTRUCTOR: Method to initialize objects with specific values
    public Product(String name, double price, String barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    // 3. ACCESS CONTROL: Securely accessing private data via Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    
    // 4. ABSTRACTION & LOGIC: Calculating VAT (KDV) inside the class logic
    public double calculateFinalPrice() {
        // Business Logic: Returning price with 20% VAT included
        return this.price * 1.20; 
    }
}