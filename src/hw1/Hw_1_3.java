package hw1;

public class Hw_1_3 {

	public static void main(String[] args) {
		// hw1-3:將秒數換算為天數、時、分、秒
		// convert seconds to date
		int days, hours, minutes, seconds, totalSeconds;
		totalSeconds = 256559;

		days = totalSeconds / (60 * 60 * 24);		// 計算天數
		seconds = totalSeconds % 60;				// 計算秒數
		minutes = (totalSeconds / 60) % 60;			// 計算分鐘
		hours = (totalSeconds / (60 * 60)) % 24;	// 計算小時

//		System.out.println("seconds:" + seconds);
//		System.out.println("minutes:" + minutes);
//		System.out.println("hours:" + hours);
//		System.out.println("days:" + days);
		
		System.out.println(days+"天"+hours+"時"+minutes+"分"+seconds+"秒");

	}

}
