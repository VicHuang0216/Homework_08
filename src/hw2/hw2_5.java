package hw2;

public class hw2_5 {
	public static void main(String[] args) {
		
		int a = 0;

		for (int i = 1; i <= 49; i++) {

			int b = i / 10;
			int c = i % 10;

			if (b != 4 && c != 4) {
				System.out.println(i);
				a++;
			}

		}
		System.out.println("總共有" + a + "個");

	}

}
