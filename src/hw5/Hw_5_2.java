package hw5;

public class Hw_5_2 {
	public static void main(String[] args) {

		Hw_5_2 r = new Hw_5_2();
		r.randAvg();

	}

	void randAvg() {
		int[] rand = new int[10];
		int sum = 0;
		
		System.out.println("本次亂數結果:");
		// 產生10個亂數
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random() * 101);
			sum += rand[i];
			System.out.print(rand[i] + " ");
		}
		System.out.println();
		// 計算平均值
		double avg = (double) sum / rand.length;
//		System.out.println("sum:" + sum);
		System.out.println(avg);

	}

}
