package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setStart(String start) {
        this.start = start;
    }
    
    public String getStart() {
        return this.start;
    }
    
    public void setDest(String dest) {
        this.dest = dest;
    }
    
    public String getDest() {
        return this.dest;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    Train(int number, String type, String start, String dest, double price){
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }
    
    Train(){
        
    }
    public int compareTo(Train inTrain){
        if(this.number > inTrain.number) {
            return -1;
        }else if(this.number == inTrain.number) {
            return 0;          
        }else {
            return 1;
        }
        
    }

    @Override
    public String toString() {
        return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
                + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(dest, number, price, start, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Train other = (Train) obj;
        return Objects.equals(dest, other.dest) && number == other.number
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
                && Objects.equals(start, other.start) && Objects.equals(type, other.type);
    }
    
    
    
    
}
