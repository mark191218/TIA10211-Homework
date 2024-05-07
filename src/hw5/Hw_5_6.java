package hw5;

public class Hw_5_6 {

	public static void main(String[] args) {
		
		Hw_5_6 auth = new Hw_5_6();
		System.out.println("本次隨機產生驗證碼為:");
		auth.getAuthCode();	
		
	}

	String getAuthCode() {
		// 建立字元表 0-9, a-z, A-Z
		char[] charArray = {'0','1','2','3','4','5','6','7','8','9',
				'a','b','c','d','e','f','g','h','i','j','k','l','m',
				'n','o','p','q','r','s','t','u','v','w','x','y','z',
				'A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

		// 產生8個隨機字元，並填入字元陣列
		char[] authCode = new char[8];
		for (int i = 0; i < authCode.length; i++) {
			int rand = (int) (Math.random() * (charArray.length));
			authCode[i] = charArray[rand];
		}
		// 將字元陣列轉換成字串輸出
		String str = new String(authCode);
		System.out.println(str);
		
		return str;
	}

}
