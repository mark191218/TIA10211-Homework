package hw2;

public class Hw_2_6 {

	public static void main(String[] args) {
		// hw 2-6 列印出數字倒金字塔
		int endNumber = 10;		// 列印的最後數字
		int height = endNumber;	// 印出的層數

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= endNumber; j++) {
				System.out.print(j + " ");
			}
			endNumber--;
			System.out.println();
		}
	}

}
