import java.util.Scanner;

public class Beak1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 1;
		int countT = 0, countF = 0;
		for (int i = 1; i <= n; i++) {
			result = i;

			while (result % 2 == 0 || result % 5 == 0) {
				if (result % 2 == 0) {
					result /= 2;
					countT++;
				}
				if (result % 5 == 0) {
					result /= 5;
					countF++;
				}
			}
		}
		if(countT < countF)
			System.out.println(countT);
		else
			System.out.println(countF);
	}
}
