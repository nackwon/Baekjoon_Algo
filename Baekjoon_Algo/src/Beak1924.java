import java.util.Scanner;

public class Beak1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int number = 0;
		int[] mday = new int[13];

		mday[1] = mday[3] = mday[5] = mday[7] = mday[8] = mday[10] = mday[12] = 31;
		mday[2] = 28;
		mday[4] = mday[6] = mday[11] = mday[9] = 30;

		int sum = 0;

		for (int i = 1; i <= 12; i++) {
			if (i == x)
				break;
			sum += mday[i];
		}

		sum += y;

		switch (sum % 7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;

		}
	}
}
