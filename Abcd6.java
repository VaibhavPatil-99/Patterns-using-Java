package Astricks;

public class Abcd6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
		
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print((char) (ch+4+j));
			}
			System.out.println();
			ch++;
		}
	}

}
