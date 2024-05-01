package hw4;

import java.util.Arrays;

public class Hw_4_6 {

	public static void main(String[] args) {
		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] maxScore = new int[6];		// 存最高分
		int[] maxScoreCount = new int[8];	// 存下統計資料

		// print total score
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		
		// search max score
		for (int i = 0; i < score.length; i++) {
			int tempMax = 0;
			for (int j = 0; j < score[0].length; j++) {
				
				if(score[i][j] > tempMax) {
					tempMax = score[i][j]; 
				}
			}
			maxScore[i] = tempMax;
		}
		
		// print max score
//		for (int i = 0; i < maxScore.length; i++) {
//			System.out.print(maxScore[i] + " ");
//		}
		
		// 統計最高分次數
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[0].length; j++) {
				if (score[i][j] == maxScore[i]) {
					maxScoreCount[j]++;
				}
			}
		}
		System.out.println();
		System.out.println("======== 最高分次數統計 ========");
		for (int i = 0; i < maxScoreCount.length; i++) {
			System.out.print(maxScoreCount[i] + "\t");
		}
		
	}

}
