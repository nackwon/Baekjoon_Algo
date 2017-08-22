import java.util.Scanner;

public class Beak2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int result = 0;
		long num = 0;
		if (1 <= n && n <= 100000000) {
			while (num < n) {
				result++;
				num = 3 * result * (result - 1) + 1;
			}
			System.out.println(result);
		}
	}
}
