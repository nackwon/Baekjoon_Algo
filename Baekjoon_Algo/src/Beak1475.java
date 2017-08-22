import java.io.IOException;
import java.util.Scanner;

public class Beak1475 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		n = n.replace('9', '6');
		int[] set = new int[10];
		
		for(int i=0;i<n.length();i++){
			set[n.charAt(i)-48]++;
		}
		
	}

}
