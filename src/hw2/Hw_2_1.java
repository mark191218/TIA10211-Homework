package hw2;

public class Hw_2_1 {
	public static void main(String[] args) {
		//hw2-1 計算0~1000之間的偶數和
		int sum = 0;
		
		for(int i=1; i<=1000; i++) {
			if(i%2 == 0) {
				sum = sum+i;
			}			
		}
		System.out.println("0~1000之間的偶數和為"+sum);
	}
}
