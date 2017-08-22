import java.util.Scanner;

public class Beak2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[3];

		while (true) {
			if (a % 10 > b % 10) {
				for (int i = 0; i < arr.length; i++) {
					arr[i] = a % 10;
					a = a / 10;
					System.out.print(arr[i]);
				}
				break;
			}else {
				int tmp = b;
				b = a;
				a = tmp;
			}
		}
	}

}
