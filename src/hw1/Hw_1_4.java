package hw1;

public class Hw_1_4 {

	public static void main(String[] args) {
		// hw1-4 計算圓面積與圓周長
		final double PI = 3.1415;
		double radius, area, circumference;
		radius = 5;

		area = PI * radius * radius; 		// 計算園面積 PI*r*r
		circumference = PI * radius * 2; 	// 計算圓周長 PI*2*r

		System.out.printf("圓面積: %.4f\n", area);
		System.out.printf("圓周長: %.4f\n", circumference);

	}

}
