	import java.util.Scanner;
	
	public class Beak1934 {
	
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int Testcase = sc.nextInt();
			int number1, number2;
			int result = 0;
			int i, j;
	
			for (i = 0; i < Testcase; i++) {
				number1 = sc.nextInt();
				number2 = sc.nextInt();
				result = lcm(number1, number2);
				System.out.println(result);
			}
		}
	
		// 최대공약수
		public static int gcd(int a, int b) {
	
			if (a < b) {
				return gcd(b, a);
			} else if (a % b == 0) {
				return b;
			} else {
				return gcd(b, a % b);
			}
		}
	
		//최소공배수
		public static int lcm(int a, int b) {
	
			if (gcd(a, b) != -1)
				return a * b / gcd(a, b);
			else
				return -1;
		}
	}
