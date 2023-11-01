package Astricks;

public class Abcd5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print((char)(ch+4));
			}
			System.out.println();
			ch++;
		}
	}

}
