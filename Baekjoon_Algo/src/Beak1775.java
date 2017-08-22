import java.util.Scanner;

public class Beak1775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TestCase = sc.nextInt();
		int k, n;
		int[] result = new int[TestCase];
		for (int i = 0; i < TestCase; i++) {
			k = sc.nextInt();
			n = sc.nextInt();
			result[i] = function(k, n);
		}
		for (int i = 0; i < TestCase; i++) {
			System.out.println(result[i]);
		}
	}

	public static int function(int k, int n) {
		
		if (k == 0) {
			return n;
		} else if (n == 1) {
			return 1;
		}
		return function(k - 1, n) + function(k, n - 1);
	}
}
