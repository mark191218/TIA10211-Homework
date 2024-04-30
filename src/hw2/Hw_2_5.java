package hw2;

public class Hw_2_5 {

	public static void main(String[] args) {
		// hw 2-5 1~49中剔除有4的數字，輸出結果，並計算有幾個數字
		int count = 0;
		int removeNum = 4;

		System.out.print("可選擇數字:");
		for (int i = 1; i <= 49; i++) {
			if ((i % 10 != removeNum) && ((i / 10) % 10 != removeNum)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "個");
	}
}
