package hw2;

public class TestNineNine {

	public static void main(String[] args) {
		int i, j;

		// ------------------------------------------
		// for loop
//		for(i=1;i<=9;i++) {
//			for(j=1;j<=9;j++) {
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}

		// -------------------------------------------
		// for and while loop
		System.out.println("for and while loop");
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("==========================================================");		
		// -------------------------------------------
		// while and do-while loop
		System.out.println("while and do-while loop");
		i = 1;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);

			System.out.println();
			i++;
		}
		System.out.println();
//		for(i=1;i<5;i++) {
//			System.out.print(i+1);
//		}
	}

}
