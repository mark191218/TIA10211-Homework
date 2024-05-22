package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw_7_4 {

    public static void main(String[] args) throws Exception {
        File folder = new File("C:\\data");
        if (!folder.exists()) {
            folder.mkdir();
        }
        
        Animal[] a = new Animal[4];
        a[0] = new Cat("cat 1");
        a[1] = new Cat("cat 2");
        a[2] = new Dog("dog 1");
        a[3] = new Dog("dog 2");

//        for (int i = 0; i < a.length; i++) {
//            a[i].speak();
//        }      
      
        // data output
//        try {
//            FileOutputStream fout = new FileOutputStream(new File("C:/data/object.ser"));
//            ObjectOutputStream objectOut = new ObjectOutputStream(fout);
//
////            objectOut.writeObject(a[0]);
//            for (int i = 0; i < a.length; i++) {
//                objectOut.writeObject(a[i]);
//            }
//            objectOut.close();
//            fout.close();
//
//        } catch (IOException e) {
//
//        }
//        System.out.println("資料寫入完畢");
        
        // data input
        FileInputStream fin = new FileInputStream(new File("C:/data/object.ser"));
        ObjectInputStream objectIn = new ObjectInputStream(fin);
        try {           
            while(true) {
                ((Animal)objectIn.readObject()).speak();
                System.out.println("--------------------");
            }
        } catch (EOFException e) {
            System.out.println("讀取完畢");
        }
        objectIn.close();
        fin.close();        
        
    }

}
