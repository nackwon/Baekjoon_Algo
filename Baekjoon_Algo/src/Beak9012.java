import java.util.Scanner;

public class Beak9012 {

	static String test;
	static int result[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		result = new int[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			test = sc.nextLine();
			result[i] = check(test);
		}
		
		for(int i=0;i<n; i++){
			if(result[i] != 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

	public static int check(String input) {
		int result = 0;
		char[] inputarr = test.toCharArray();

		for (int i = 0; i < inputarr.length; i++) {

			if (result < 0)
				return -1;
			else if (inputarr[i] == '(') {
				result = result + 1;
				continue;
			} else if (inputarr[i] == ')') {
				result = result - 1;
				continue;
			}
		}
		return result;
	}
}
