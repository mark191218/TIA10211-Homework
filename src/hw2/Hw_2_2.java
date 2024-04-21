package hw2;

public class Hw_2_2 {
	public static void main(String[] args) {
		//hw 2-2 計算10的階乘(10!)，用for-loop解題
		int product=1,
			factorial = 10	;
		
		for(int i=1;i<=factorial;i++) {
			product = i * product;
			
		}
		System.out.println(factorial+"的階乘:"+product);
	}
}
