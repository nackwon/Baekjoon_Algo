import java.util.Arrays;
import java.util.Scanner;

public class Beak1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String stn = String.valueOf(n);
		int[] arr = new int[stn.length()];

		for (int i = 0; i < stn.length(); i++) {
			arr[i] = stn.charAt(i) - 48;
		}
		Arrays.sort(arr); 
		// reverse(arr); reverse sort
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
	//reverse class but first to sort it in ascending order
	/*public static void reverse(int[] arr) {
		int last = arr.length - 1;
		int middle = arr.length / 2;
		for (int i = 0; i <= middle; i++) {
			int tmp = arr[i];
			arr[i] = arr[last - i];
			arr[last - i] = tmp;
		}
	}
}*/

/*
 * class Comp implements Comparator<Integer> {
 * 
 * @Override public int compare(Integer o1, Integer o2) {
 * 
 * if (o1 > o2) return -1; else if (01 < o2) return 1; else return 0; }
 * 
 * }
 */