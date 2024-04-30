package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Hw_3_1 {

	public static void main(String[] args) {		
		//接收輸入數值
		int[] length = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入三角形邊長");
		length[0] = s.nextInt();
		length[1] = s.nextInt();
		length[2] = s.nextInt();

		Arrays.sort(length);	// 排序陣列方便計算
		System.out.print(length[0]+" ");
		System.out.print(length[1]+" ");
		System.out.println(length[2]);
		
		// 判斷三角形種類
		boolean isTriangle = (length[0] + length[1]) > length[2];
		boolean isRightTriangle = ((int)Math.pow(length[0],2) + (int)Math.pow(length[1],2) == (int)Math.pow(length[2],2));
		boolean isRegularTirangle = (length[0] == length[1]) && (length[0] == length[2]);
		boolean isIsoscelesTriangle = length[0] == length[1];
		
		// 輸出結果
		if (isTriangle) {
			if (isRightTriangle) 
				System.out.println("直角三角形");	// right triangle
			else if(isRegularTirangle)
				System.out.println("正三角形");	// regular triangle
			else if(isIsoscelesTriangle)
				System.out.println("等腰三角形");	// isosceles triangle
			else
				System.out.println("其他三角形");	// triangle
		} else 
			System.out.println("不是三角形");		// not triangle
	}

}
