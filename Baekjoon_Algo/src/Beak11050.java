import java.util.Scanner;

public class Beak11050 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int result = Factorial(n) / (Factorial(n - k) * Factorial(k));

		System.out.println(result);
	}

	public static int Factorial(int n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return Factorial(n - 1) * n;
	}
}
