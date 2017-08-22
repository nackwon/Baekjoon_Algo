import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Beak2748 {


	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		int mod = 1000000;
		int p = mod / 10 * 15;
		int[] list = new int[p];
		list[0] = 0;
		list[1] = 1;
		for (int i = 2; i < p; i++) {
			list[i] = list[i - 2] + list[i - 1];
			list[i] %= mod;
		}
		int result = (int) (n % p);
		System.out.println(list[result]);
	}

	/*
	 * public static int pisano_period(int m) { int period = 0; int number1 = 1,
	 * number2 = 1; do { int temp = number1; number1 = number2; number2 = (temp +
	 * number2) % m; period++; } while (!(number1 == 1 && number2 == 1)); return
	 * period; }
	 */
}
