package hw_ext;

public abstract class Pen {
    private String brand;
    private double price;
    
    Pen(String brand,double price  ){
        this.brand = brand;
        this.price = price;
    }
    
    Pen(){
        
    }
    
    void setBrand(String brand) {
        this.brand = brand;
    }
    
    void setPrice(double price) {
        this.price = price;
    }
    
    
    String getBrand() {
        return brand;
    }
    
    double getPrice() {
        return price;
    }
    
    abstract void write();
}