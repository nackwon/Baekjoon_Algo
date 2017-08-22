import java.util.Arrays;
import java.util.Scanner;

public class Beak9426 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int count = 0, p;
		int middle, sum = 0;
		p = n - k + 1;
		if (k % 2 != 0) // È¦¼ö
			middle = (k + 1) / 2;
		else
			// Â¦¼ö
			middle = k / 2;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i+1 >= middle) {
				count++;
				sum = sum + arr[i];
				if (count == p)
					break;
			}
		}
		System.out.println(sum);
	}
}
