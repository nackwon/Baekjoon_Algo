import java.util.Scanner;

public class Beak1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt(); // 작은 수
		int n = sc.nextInt(); // 큰 수
		int[] arr = new int[n + 1];

		// 0(소수) / 1(소수 아님) 로 소수인지 아닌지 판별
		for (int i = 0; i <= n; i++) 
			arr[i] = 0;//큰 수까지 전부 0으로 초기화
		arr[1] = 1; // 1은 소수가 아니므로 1로 초기화

		for (int i = 2; i <= n; i++) // 각 배수를 구한다.
			for (int j = 2; i * j <= n; j++)
				arr[i * j] = 1; // 소수가 아닌 것은 1로 초기화

		for (int i = m; i <= n; i++) // 입력한 범위 
			if (arr[i] != 1) // 배열 안에 있는 수가 1이 아니면 
				System.out.println(i); // 소수이므로 출력

		sc.close();
	}

}
