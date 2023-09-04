package hw1;

public class hw1 {
	public static void main(String[] args) {
		//1.
		int a = 12 ;
		int b = 6 ;
		int num1 = a+b ;
		int num2 = a*b ;
		System.out.println(num1);
		System.out.println(num2);
		
		//2.
		int c = 200 ;
		int num3 = c/12 ;
		int num4 = c%12 ;
		String s1 = "打" ;
		String s2 = "顆" ;
		System.out.println(num3+s1+num4+s2);
		
		//3.
		int d = 256559 ;
		int num5 = d/(60*60*24) ;
		int e = d%(60*60*24) ;
		int num6 = e/(60*60) ; 
		int f = e%(60*60) ;
		int num7 = f/60 ;
		int num8 = f%60 ;
		String s3 = "天" ;
		String s4 = "小時" ;
		String s5 = "分" ;
		String s6 = "秒" ;
		System.out.println(num5+s3+num6+s4+num7+s5+num8+s6);
		
		//4.
		double g = 3.1415 ;
		int h = 5 ;
		double num9 = h*h*g ;
		double num10 = h*2*g ;
		System.out.println("圓面積="+num9);
		System.out.println("圓周="+num10);
		
		//5.
		int i = 1500000 ;
		double j = 1.02 ;
		double num11 = i*j*j*j*j*j*j*j*j*j*j ;
		System.out.println(num11+"元");
		
		//6.
		
		System.out.println(5+5);
		System.out.println(5+'5');
		System.out.println(5+"5");
		
		
		
		
		
	}

}
