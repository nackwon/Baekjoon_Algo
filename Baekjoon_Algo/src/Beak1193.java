import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Beak1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int down; // 분모
		int up; // 분자
		int count = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				if (i % 2 != 0) { // 홀수
					down = j + 1;
					up = i - j;
				} else {
					down = i - j;
					up = j + 1;
				}
				String txt = up + "/" + down;
				count++;
				if (count == num) {
					System.out.print(txt);
					break;
				}
			}
		}
	}

}
