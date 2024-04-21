package hw1;

public class Hw_1_2 {

	public static void main(String[] args) {
		//hw1-2:計算200顆雞蛋總共是幾打幾顆
		int eggs, dozen, lastEggs;
		
		eggs = 200;				// 總雞蛋數
		dozen = eggs / 12;		// 計算多少打
		lastEggs = eggs % 12; 	// 不滿一打的雞蛋數量
		
		System.out.println("雞蛋總共"+dozen+"打"+lastEggs+"顆");

	}

}
