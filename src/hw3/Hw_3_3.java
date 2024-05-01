package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw_3_3 {

	public static void main(String[] args) {
		// 讀取鍵盤輸入數值
		Scanner s = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字");
		int removeNum = s.nextInt();

		// 判斷不要的數字，並統計可用數字數量
		int count = 0;
		int[] lottoNumber = new int[49];
		for (int i = 0; i < lottoNumber.length; i++) {
			int lotto = i + 1;
			if ((lotto % 10 != removeNum) && (lotto / 10) % 10 != removeNum) {
				lottoNumber[count] = lotto;
				count++;
			}
		}
		System.out.println();

		Hw_3_3.showArray(lottoNumber);
		System.out.println("總共有" + count + "個數字可選\n");

		// 隨機產生六個可選數字，並排序後輸出
		int[] randomLotto = new int[6];
		for (int i = 0; i < 6; i++) {
			while (true) {
				int random = (int) (Math.random() * count) + 1; // 產生一個隨機亂數
				// 判斷亂數選出的數字是否能用(數字不為0)
				if (lottoNumber[random] != 0) {
					randomLotto[i] = lottoNumber[random];
					lottoNumber[random] = 0; // 將使用過的數字清為0，避免下次重複選到
					break;
				}
			}
		}
		Arrays.sort(randomLotto);
		System.out.println("隨機選號:");
		Hw_3_3.showArray(randomLotto);

	}

	public static void showArray(int[] lottoNumber) {
		// print array，數值為0的元素就不輸出
		for (int i = 0; i < (lottoNumber.length); i++) {
			if (lottoNumber[i] == 0)
				break;
			System.out.print(lottoNumber[i] + "\t");

			if ((i + 1) % 6 == 0)
				System.out.println();
		}
	}

}
