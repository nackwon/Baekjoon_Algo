import java.io.IOException;
import java.util.Scanner;

public class Beak1003 {

	static int zero = 0;
	static int one = 0;

	public static int fibo(int number) {
		if (number == 0) {
			zero++;
			return 0;
		} else if (number == 1) {
			one++;
			return 1;
		} else
			return fibo(number - 1) + fibo(number - 2);
	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while(T !=0) {
			int number = sc.nextInt();
			fibo(number);
			System.out.println(zero+" "+one);
			zero = 0;
			one = 0;
			T --;
		}
	}

}
