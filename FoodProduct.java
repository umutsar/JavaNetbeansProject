package supermarketcashiersystem;

// 'extends' kelimesi ile Product sınıfından miras alıyoruz (Inheritance) 
public class FoodProduct extends Product {
    private String expirationDate;

    public FoodProduct(String name, double price, String barcode, String expirationDate) {
        super(name, price, barcode); // Üst sınıftaki constructor'ı çağırır
        this.expirationDate = expirationDate;
    }
}