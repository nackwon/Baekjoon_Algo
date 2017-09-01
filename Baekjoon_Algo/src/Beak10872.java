import java.util.Scanner;

public class Beak10872 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 1;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println(result);
	}
}
