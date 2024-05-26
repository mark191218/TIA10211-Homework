package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw_8_1 {

    public static void main(String[] args) {
        // Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
        // Object物件、“Snoopy”、BigInteger(“1000”)
        // new arrayList and add elements
        List list = new ArrayList();
        list.add(new Integer(100));
        list.add(new Double(3.14));
        list.add(new Long(21L));
        list.add(new Short("100"));
        list.add(5.1);
        list.add(new String("Kitty"));
        list.add(100);
        list.add(new Object());
        list.add(new String("Snoopy"));
        list.add(new BigInteger("1000"));

//        System.out.println("toString = " + list);
//        System.out.println("size:" + list.size());
        
        // display arrayList
        System.out.println("========== for Loop ==========");
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
//            System.out.println(obj + " is Number: " + (obj instanceof Number));
        }

        System.out.println("========== Iterator ==========");
        Iterator objs = list.iterator();
        while (objs.hasNext()) {
            System.out.println(objs.next());
        }

        System.out.println("========== for-each ==========");
        for (Object objList : list) {
            System.out.println(objList);
//            System.out.println(objList + "," + (objList instanceof Number));
        }
        
        // 移除非數字元素
        System.out.println("=======================================");
        System.out.println("========== filter not Number ==========");
        List filterList = new ArrayList();
        for (Object objList : list) {
//            System.out.println(objList + "," + (objList instanceof Number));
            if (objList instanceof Number) {
                filterList.add(objList);
            }
        }

        for (Object objList : filterList) {
            System.out.println(objList);
//            System.out.println(objList + "," + (objList instanceof Number));
        }
        System.out.println("=======================================");

        System.out.println("========== Iterator remove not Number ==========");
//        System.out.println("size List: " + list.size());
        // 移除非Number元素
        Iterator reNum = list.iterator();
        while (reNum.hasNext()) {
            Object obj = reNum.next();
            if (!(obj instanceof Number)) {                
                reNum.remove();
//                System.out.println(obj);
            }          
        }
        // 顯示移除後的arrayList
        System.out.println("size List: " + list.size());     
        Iterator obj2 = list.iterator();
        while(obj2.hasNext()) {
            System.out.println(obj2.next());
        }

        // test remove list, 使用for loop來移除arraryList元素,結果會有問題
        // 可能會產生ConcurrentModificationException，建議使用Iterator來操作
//        System.out.println("size List: " + list.size());
//        System.out.println("========== Test remove List ==========");
//        for (int i = 0; i < list.size(); i++) {
//            Object obj = list.get(i);
//
//            if(obj instanceof Number) {
//                list.remove(obj);
//            }           
//        }
//        System.out.println("size List: " + list.size());
//        for (int i = 0; i < list.size(); i++) {
//          Object obj = list.get(i);
//          System.out.println(obj);
//      }
        // ======================================================

    }

}
