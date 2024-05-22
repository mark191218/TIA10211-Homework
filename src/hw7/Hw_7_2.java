package hw7;

import java.io.FileWriter;
import java.io.IOException;

public class Hw_7_2 {

    public static void main(String[] args) {
 
        try {
            FileWriter fWrite = new FileWriter("Data.txt");
            
            for(int i = 0; i < 10; i++) {
                Integer w = (int)(Math.random() * 1000 + 1);
                fWrite.write(w.toString()+ "\n");
                System.out.println(w);
            }        
            fWrite.close();
        } catch (IOException e) {

        }

    }

}
