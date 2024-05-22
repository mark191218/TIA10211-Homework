package hw_ext;

public class InkBrush extends Pen {
    InkBrush(String brand, double price) {
        super(brand, price);
    }

    InkBrush() {

    }
    
    double getPrice() {
        return 0.9 * super.getPrice();
    }

    void write() {
        System.out.println("沾墨汁再寫");
    }
}
