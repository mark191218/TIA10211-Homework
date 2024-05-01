package hw4;

import java.util.Scanner;

public class Hw_4_4 {

	public static void main(String[] args) {
		int[][] member = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		int[] loanList = new int[member.length];

		// 讀取鍵盤輸入數值
		Scanner s = new Scanner(System.in);
		System.out.println("阿文、小華...請輸入借款金額");
		int amount = s.nextInt();
		
		int memberCount = 0;
		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < member.length; i++) {
			if (member[i][1] >= amount) {
				System.out.print(member[i][0]+" ");
				memberCount++;
			}
		}
		System.out.println("共"+ memberCount +"人");
	}

}
