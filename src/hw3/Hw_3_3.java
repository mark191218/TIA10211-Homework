package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw_3_3 {

	public static void main(String[] args) {
		// 產生一個1~49的隨機亂數

		// 讀取鍵盤輸入數值
		Scanner s = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字");
		int removeNum = s.nextInt();

//		int removeNum = 3;
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

//		Hw_3_3.showArray(lottoNumber);
		Hw_3_3.showArray(lottoNumber);
		System.out.println("總共有" + count + "個數字可選");

		int[] out = new int[6];
//		int[] out = {1,2,3,4,5,6};
//
		int k = 0;
		boolean display = true;
		boolean hasDuplicates = false;
		while (display) {
//			int random = (int) (Math.random() * count) + 1;

			for (int i = 0; i < out.length; i++) {
				int random = (int) (Math.random() * count) + 1;
				out[i] = lottoNumber[random];
			}
			Arrays.sort(out);

			for (int i = 0; i < out.length - 1; i++) {
				if (out[i] == out[i + 1]) {
					hasDuplicates = true;
					System.out.println("Number repeat");
					break;
				}
			}
			
			if (hasDuplicates == false) {
				display = false;
			}

		}

		Hw_3_3.showArray(out);

	}

	public static void showArray(int[] lottoNumber) {
		// print array
		for (int i = 0; i < (lottoNumber.length); i++) {
			if (lottoNumber[i] == 0)
				break;
			System.out.print(lottoNumber[i] + "\t");

			if ((i + 1) % 6 == 0)
				System.out.println();
		}
	}

}
