package hw3;

import java.util.Scanner;

public class Hw_3_2_advance {

	public static void main(String[] args) {
		// 產生一個0~100的隨機亂數
		int random = (int) (Math.random() * 101);

		// 讀取鍵盤輸入數值
		Scanner s = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		while (true) {
			int inputNumber = s.nextInt();
			// 判斷輸入數字大小
			if (random > inputNumber)
				System.out.println("猜錯囉，答案比" + inputNumber + "大");
			if (random < inputNumber)
				System.out.println("猜錯囉，答案比" + inputNumber + "小");

			// 判斷是否猜中數字
			if (inputNumber == random) {
				System.out.println("答對了! 答案就是:" + inputNumber);
				break;
			}
		}

	}

}
