package hw2;

public class hw2_1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int a = 2 ; a<=1000 ; a+=2 ) {
			sum += a;
		}
		
		System.out.println("1~1000的偶數和="+sum);
	}

}
