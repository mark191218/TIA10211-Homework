package hw2;

public class Hw_2_7 {

	public static void main(String[] args) {
		// hw 2-7 印出文字金字塔
		int index = 0x41; // char 'A'

		for (int j = 0; j < 6; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print((char) index);
			}
			index++;
			System.out.println();
		}
	}
}
