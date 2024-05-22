package hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Hw_7_1 {

    public static void main(String[] args) {
        int i, charCount = 0, lineCount = 0;
        long fileSize = 0 ;
        String str = "Sample.txt";
        
        // 讀取文件列資料
        File file = new File(str);
        if (file.exists()) {    //確認檔案是否存在
//            System.out.println("bytes:" + file.length());
            fileSize = file.length();
        } else {
            System.out.println("File not found");
        }

        try {
            BufferedReader rd = new BufferedReader(new FileReader(str));
            String readLine;
            while ((readLine = rd.readLine()) != null) {
                lineCount++;
            }
            rd.close();
//            System.out.println("Line:" + lineCount);
        } catch (IOException e) {

        }
        
        // 讀取txt檔案並逐字印出
        try {
//            String str = "C:\\TIA102_Workspace\\TIA10211-Homework\\src\\hw7\\Sample.txt";                               
            InputStream f = new FileInputStream(str);
            InputStreamReader reader = new InputStreamReader(f, "UTF-8");
            BufferedReader buff = new BufferedReader(reader);

            while ((i = buff.read()) != -1) {
                System.out.print((char) i);
                charCount++;
            }
            buff.close();
            f.close();
//            System.out.println("Char:" + charCount);
        } catch (IOException e) {

        }
        // 輸出結果
        System.out.println("Sample.txt檔案共有"+ fileSize +"個位元組，"+ charCount +"個字元，"+ lineCount +"列資料");
    }

}
