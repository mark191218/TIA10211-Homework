package hw4;

public class Hw_4_1 {

	public static void main(String[] args) {
		int[] num = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double sum = 0.0;
		double average = 0.0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		average = sum / num.length;

		System.out.println("平均值:" + average);
		for (int i = 0; i < num.length; i++) {
			if (num[i] > average) {
				System.out.print(num[i]+" ");
			}
		}
	}

}
