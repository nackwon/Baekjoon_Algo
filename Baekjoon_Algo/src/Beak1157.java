import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Beak1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[26];
		int[] arr1;
		for(int i=0;i<str.length();i++){
			int n = str.charAt(i);
			if(n < 97)
				arr[n-65]++;
			else
				arr[n-97]++;
		}
		
		arr1 = Arrays.copyOf(arr, 26);
		Arrays.sort(arr);
		if(arr[24] == arr[25])
			System.out.println("?");
		else{
			for(int i=0;i<26;i++){
				if(arr[25] ==arr1[i]){
					System.out.printf("%c",65+i);
				}
			}
		}
	}
}
