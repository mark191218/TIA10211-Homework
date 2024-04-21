package hw1;

public class Hw_1_6 {

	public static void main(String[] args) {
		// hw1-6 解釋不同的輸出結果
		System.out.println(5+5);	// 由於是兩個整數數值相加運算，所以輸出結果為10
		
		System.out.println(5+'5');	// 整數5與字元'5'相加時，字元會轉換成編碼值進行運算
									// 而字元'5'的編碼值為53，所以輸出結果為5+53=58
		
		System.out.println(5+"5");	// 整數5與字串"5"相加運算，為整數與字串進行串接，所以輸出結果為55
	}
}
