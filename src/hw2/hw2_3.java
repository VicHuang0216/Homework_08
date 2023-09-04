package hw2;

public class hw2_3 {
	public static void main(String[] args) {
		int sum = 1;
		int a = 1 ;
		while(a <= 10) {
			sum=sum*a;
			a++;
		}
		System.out.println("1~10的連乘積="+sum);
	}

}
