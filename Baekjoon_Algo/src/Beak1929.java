import java.util.Scanner;

public class Beak1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt(); // ���� ��
		int n = sc.nextInt(); // ū ��
		int[] arr = new int[n + 1];

		// 0(�Ҽ�) / 1(�Ҽ� �ƴ�) �� �Ҽ����� �ƴ��� �Ǻ�
		for (int i = 0; i <= n; i++) 
			arr[i] = 0;//ū ������ ���� 0���� �ʱ�ȭ
		arr[1] = 1; // 1�� �Ҽ��� �ƴϹǷ� 1�� �ʱ�ȭ

		for (int i = 2; i <= n; i++) // �� ����� ���Ѵ�.
			for (int j = 2; i * j <= n; j++)
				arr[i * j] = 1; // �Ҽ��� �ƴ� ���� 1�� �ʱ�ȭ

		for (int i = m; i <= n; i++) // �Է��� ���� 
			if (arr[i] != 1) // �迭 �ȿ� �ִ� ���� 1�� �ƴϸ� 
				System.out.println(i); // �Ҽ��̹Ƿ� ���

		sc.close();
	}

}
