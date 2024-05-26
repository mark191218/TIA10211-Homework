package hw8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hw_8_2 {
    public static void main(String[] args) {
        Train[] t = new Train[7];
        t[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        t[1] = new Train(1254, "區間", "屏東", "基隆", 700);
        t[2] = new Train(118, "自強", "高雄", "台北", 500);
        t[3] = new Train(1288, "區間", "新竹", "基隆", 400);
        t[4] = new Train(122, "自強", "台中", "花蓮", 600);
        t[5] = new Train(1222, "區間", "樹林", "七堵", 300);
        t[6] = new Train(1254, "區間", "屏東", "基隆", 700);

        System.out.println("========= 顯示Train物件 =========");
        Set<Train> tSet = new HashSet<Train>();
        for (int i = 0; i < t.length; i++) {
            tSet.add(t[i]);
            System.out.println(t[i]);
        }
        
        System.out.println("========= 顯示不重複的Train物件 =========");
//        System.out.println(tSet.size());
        Iterator seti = tSet.iterator();
        while(seti.hasNext()) {
            System.out.println(seti.next());
        }
        
//        System.out.println(tSet);

//        Arrays.sort(t);
//        for (int i = 0; i < t.length; i++) {
//            System.out.println(t[i]);
//        }
        
        System.out.println("========= 顯示不重複且排序過的Train物件 =========");
        Set treeTrain = new TreeSet();
        for (int i = 0; i < t.length; i++) {
            treeTrain.add(t[i]);
        }
//        System.out.println(treeTrain);
        for(Object out : treeTrain) {
            System.out.println(out);
        }
        
    }
}
