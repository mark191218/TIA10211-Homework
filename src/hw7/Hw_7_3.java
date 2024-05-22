package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw_7_3 {

    public static void main(String[] args) {
        String src = "test_in.txt";
        String dest = "test_out.txt";

        Hw_7_3 co = new Hw_7_3();
        
        long startTime = System.currentTimeMillis();
        
        co.copyFile(src, dest);
        
        long endTime = System.currentTimeMillis();
        
        long duration = endTime - startTime;
        System.out.println("Time: "+ duration);

    }

    void copyFile(String src, String dest) {
        try {
//            FileInputStream in = new FileInputStream(src);
//            FileOutputStream out = new FileOutputStream(dest);
            // 測試 1
//            FileReader fr = new FileReader(src);
//            FileWriter fw = new FileWriter(dest);
//            int i = 0;
//            while ((i = fr.read()) != -1) {
//                fw.write(i);
//            }
////            fw.write("test_data");
//            fw.close();
//            fr.close();
            
            // 測試 2
            FileInputStream ins = new FileInputStream(src);
            FileOutputStream outs = new FileOutputStream(dest);
            int i = 0;
            while ((i = ins.read()) != -1) {
              outs.write(i);
            }
//          fw.write("test_data");
            outs.close();
            ins.close();
            
            
        } catch (IOException e) {

        }

    }

}
