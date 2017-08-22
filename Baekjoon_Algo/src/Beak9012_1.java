import java.util.Scanner;
import java.util.Stack;

public class Beak9012_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input;

		for (int i = 0; i < n; i++) {
			input = sc.nextLine();
			if (Check(input))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static boolean Check(String input) {
		boolean isChecked = true;

		Stack<Character> stack = new Stack<Character>();
		char[] charr1 = input.toCharArray();

		for (int i = 0; i < charr1.length; i++) {

			if (charr1[i] == '(')
				stack.push(charr1[i]);
			else {
				if (stack.isEmpty()) {
					isChecked = false;
					break;
				} else
					stack.pop();
			}
		}

		if (isChecked && stack.isEmpty() != false)
			isChecked = false;

		return isChecked;
	}
}
