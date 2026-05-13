package supermarketcashiersystem;

public class Product {
    // 1. ACCESS CONTROL: Değişkenleri 'private' yaparak veriyi koruyoruz (10 Puan) 
    private String name;
    private double price;
    private String barcode;

    // 2. CONSTRUCTOR: Nesne yaratılırken çalışan yapıcı metot (10 Puan) 
    public Product(String name, double price, String barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    // 3. GETTER/SETTER: Private verilere güvenli erişim (10 Puan) 
    public String getName() { return name; }
    public double getPrice() { return price; }
    
    // 4. MATH CONCEPT: Basit bir KDV hesaplama (10 Puan) 
    public double calculateFinalPrice() {
        return this.price * 1.20; // %20 KDV eklenmiş hali
    }
}