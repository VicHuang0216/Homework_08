package hw2;

public class hw2_7 {
	public static void main(String[] args) {
		
		char A = 'A';
		
		for(int i = 1 ; i <= 6; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(A);
			}
			System.out.println();
			A++;
		}
	}

}
