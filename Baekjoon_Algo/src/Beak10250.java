import java.util.Scanner;

public class Beak10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num, k;
		int result = 0;
		int[] arr1 = new int[num1];
		
		for (k = 0; k < num1; k++) {
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[num1][h * w];
			num = 0;
			
			for (int i = 1; i <= w; i++) {
				for (int j = num; j < h + num; j++) {
					arr[k][j] = i;

					if (n == j) {
						int n1 = j % h;
						if (n1 == 0)
							n1 = h;
						arr1[k] = n1 * 100 + arr[k][j];
					}
				}
				num += h;
			}
		}
		for (int i = 0; i < num1; i++) {
			System.out.println(arr1[i]);
		}
	}
}
