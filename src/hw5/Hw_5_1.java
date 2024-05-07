package hw5;

import java.util.Scanner;

public class Hw_5_1 {

	public static void main(String[] args) {
		// 資料輸入部分
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int width = s.nextInt();	//
		int height = s.nextInt();	//
				
		// 印出方形的圖形
		Hw_5_1 square = new Hw_5_1();
		square.starSquare(width, height);
		
	}

	void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
