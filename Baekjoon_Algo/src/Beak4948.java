import java.util.Scanner;

public class Beak4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, m;

		while (true) {
			m = sc.nextInt();

			if (m == 0)
				break;

			n = m * 2;
			int[] arr = new int[n + 1];

			int count = 0;

			for (int i = 0; i < n; i++)
				arr[i] = 0;
			arr[1] = 1;

			for (int i = 2; i <= n; i++)
				for (int j = 2; i * j <= n; j++)
					arr[i * j] = 1;

			for (int i = m+1; i <= n; i++)
				if (arr[i] != 1)
					count++;

			System.out.println(count);
			//에라토스테네스의 체와 똑같이 구현
		}
	}
}
