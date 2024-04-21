package hw1;

public class Hw_1_5 {

	public static void main(String[] args) {
		// hw1-5 計算本金加利息的總額，本金150萬、年利率2%、存放年份10年
		double principal, interestRate, returnInvestment, years;
		principal = 150;	// 本金
		interestRate = 2;	// 利率
		years = 10;			// 年份
		returnInvestment = 150 * Math.pow((1 + (interestRate / 100)), years);
		System.out.printf("本金" + principal + "萬" + "存" + years + "年，年利率" + interestRate + "%%\n");
		System.out.printf("本金加利息為%.3f萬元", returnInvestment);

	}

}
