package hw_ext;

public class TestPen {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pen[] p = new Pen[2];
        p[0] = new Pencil("Pencil", 20.0);
        p[1] = new InkBrush("InkBrush", 40.0);

//        p[0].getPrice();
//        p[1].getPrice();
//        p[0].setPrice(30);
        
//        p[0].write();
//        p[1].write();
        
        for(int i =0 ;i<p.length;i++) {
            System.out.println(p[i].getPrice());
//            p[i].getPrice();
            p[i].write();
        }
        
    }

}
