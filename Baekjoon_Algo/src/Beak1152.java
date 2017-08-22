import java.util.Scanner;

public class Beak1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		String word = "";
		for (int i = 0; i < str.length(); i++) {
			String c = String.valueOf(str.charAt(i));
			if (c.equals(" ")) {
				word = "";
			} else {
				if (word.length() == 0) {
					count++;
				}
				word = c;
			}
		}
		System.out.println(count);
	}
}
