package hw2;

public class Hw_2_4 {

	public static void main(String[] args) {
		// hw 2-4 輸出結果為 1 4 9 16 25 36 49 64 81 100
		// 觀察數列的差值3 5 7 9 11 13 15 17 19，數字都遞增2，故使用迴圈累加。
		
		int sum = 1;

		for (int i = 3; i <= 21; i = i + 2) {
			System.out.print(sum + " ");
			sum = sum + i;
		}
//		System.out.println();
//		System.out.println("1 4 9 16 25 36 49 64 81 100 ");

	}

}
