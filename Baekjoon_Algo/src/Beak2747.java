import java.util.Scanner;

public class Beak2747 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = fibonacci(n);
		
		System.out.println(result);
	}

	public static int fibonacci(int number) {
		if(number <= 1)
			return number;
		else
		return fibonacci(number - 2) + fibonacci(number - 1);
	}
}
