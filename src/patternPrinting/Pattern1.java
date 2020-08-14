package patternPrinting;

public class Pattern1 {
	static void pattern1() {
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	static void pattern2() {
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void pattern3() {
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void pattern4() {
		int count =1;
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
	static void pattern5(int rows) {
		for (int i=1;i<=rows;i++) {
			for (int k=1;k<=rows-i;k++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
	static void pattern6(int rows) {
		for (int i=0;i<rows;i++) {
			for (int k=1;k<=rows-i;k++) {
				System.out.print(1);
			}
			
			System.out.println();
		}
	}
	//complexity of this code is n^2.For printing this kind of pattern n^2 is needed 
	//This can't be reduced to complexity n . 
	static void pattern7(int rows) {
		for (int i=rows; i>=1;i--) {
			
			for(int k=1; k<=rows-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}
	/* patt 8-->
	* * * 1
	* * 1 2
	* 1 2 3
	1 2 3 4
*/
	static void pattern8(int rows) {
		for (int i=1;i<=rows;i++) {
			for (int j = 1; j<=rows-i;j++) {
				System.out.print("* ");
			}
			for (int k=1; k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//pattern1();
		//pattern2();
		//pattern3();
		//pattern4();
		//pattern6(5);
		pattern7(5);
		pattern8(4);
	}
}
