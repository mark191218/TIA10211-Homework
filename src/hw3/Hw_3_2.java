package hw3;

import java.util.Scanner;

public class Hw_3_2 {

	public static void main(String[] args) {
		// 產生一個0~9的隨機亂數
		int random = (int)(Math.random() * 10);

		// 讀取鍵盤輸入數值
		Scanner s = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		while(true) {
			int inputNumber = s.nextInt();
			System.out.println("猜錯囉");
			// 判斷是否猜中數字
			if(inputNumber == random) {
				System.out.println("答對了! 答案就是:"+ inputNumber);
				break;
			}
		}
		
	}

}
