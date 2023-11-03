package Astricks;

public class Abcd8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'F';
		
		for(int i=5;i>=0;i--) {
			ch='F';
			for(int j=0;j<=i;j++) {
				System.out.print(ch--);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			ch='F';
			for(int j=0;j<=i;j++) {
				System.out.print(ch--);
			}
			System.out.println();
		}
	}

}
