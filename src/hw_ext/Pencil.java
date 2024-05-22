package hw_ext;

public class Pencil extends Pen {
    Pencil(String brand, double price) {
        super(brand, price);
    }

    Pencil() {

    }
    
    double getPrice() {        
        return 0.8 * super.getPrice();
    }
    
    void write() {
        System.out.println("削鉛筆再寫");
    }
}
