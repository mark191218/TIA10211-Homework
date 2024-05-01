package hw4;

import java.util.Scanner;

public class Hw_4_5 {

	public static void main(String[] args) {
		int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 接收輸入數值
		int[] date = new int[3];
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("請輸入日期");
			date[0] = s.nextInt(); // year
			date[1] = s.nextInt(); // month
			date[2] = s.nextInt(); // days
			
			// 日期輸入判斷
			if ((date[1] > 0) && (date[1] <= 12)) {
				// 閏年判斷
				if ((date[0] % 4 == 0) ) {	
					month[2] = 29;	//閏年則2月為29天
					if((date[2] > 0) && (date[2] <= month[date[1]]))
						break;
				}else if((date[2] > 0) && (date[2] <= month[date[1]]))
					break;			
			}		
			System.out.println("輸入有錯誤請檢查!");
		}

		// 計算天數
		int days = 0;
		for (int i = 0; i < date[1]; i++) {
			days += month[i];
		}
		days += date[2];
		System.out.println(days);
	}

}
