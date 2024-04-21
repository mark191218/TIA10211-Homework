package hw2;

public class Hw_2_3 {

	public static void main(String[] args) {
		//hw 2-3 計算10的階乘(10!)，用while-loop解題
		int product = 1,
			factorial = 10,	
			i = 1;

		while(i<=factorial) {
			product = i * product;
			i++;
		}
		System.out.println(factorial+"的階乘:"+product);

	}

}
