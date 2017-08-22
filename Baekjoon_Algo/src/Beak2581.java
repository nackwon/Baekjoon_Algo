import java.util.Scanner;

public class Beak2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		int[] arr = new int[last - first+1];
		boolean checked = true;
		int sum = 0, min = 0;
		int range = last - first;

		for (int i = 0; i <= range; i++) {
			arr[i] = first;

			if (arr[i] != 1) {
				for (int j = 2; j < first; j++) {
					if (arr[i] % j == 0) {
						checked = false;
						break;
					}
				}
				if (checked == true) {
					sum += arr[i];
					if (min == 0)
						min = arr[i];
				} else
					checked = true;
			}
			first++;
		}
		if (sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
