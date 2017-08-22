import java.util.Scanner;

public class Beak1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		boolean checked = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] != 1) {
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						checked = false;
						break;
					}
				}

				if (checked == true)
					count++;
				else
					checked = true;
			}
		}
		System.out.println(count);
	}
}
