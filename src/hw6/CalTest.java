package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

    public static void main(String[] args) {
        

        // 資料輸入部分
        Scanner s = new Scanner(System.in);
        Calculator c1 = new Calculator();
        
        while(true) {
            try {
                System.out.println("請輸入x的值:");
                c1.setX(s.nextInt());
                System.out.println("請輸入y的值:");
                c1.setY(s.nextInt());
                c1.powerXY();         
                break;
            }catch(InputMismatchException n) {
                System.out.println("輸入格式不正確");
                s.nextLine();
            }
            catch(CalException e){
                System.out.println(e.getMessage());
            }
            
        }
        
        
        
//        int x, y;
//        do {
//            System.out.println("請輸入x的值:");
//
//            if (s.hasNextInt()) {
//                x = s.nextInt(); //
//                try {
//                    c1.setX(x);
//                    break;
//                } catch (CalException e) {
//                }
//
//            } else {
//                System.out.println("輸入格式不正確");
//            }
//            
//
//        }while(true);
//      
//        do {
//            System.out.println("請輸入y的值:");
//            y = s.nextInt(); //
//            try {
//                c1.setY(y);
//            } catch (CalException e) {
////                if (x == 0 && y == 0 ) {
////                    System.out.println("0的0次方沒有意義");
////                }
////            e.printStackTrace();
//                String str = e.getMessage();
//                System.out.println(str);
////                e.NegativeError();
//            }
//        } while (y <= 0);  // while (y <= 0 && x < 0);
////        }
////    System.out.println("輸入部分OK");
//        c1.powerXY();

    }

}
