import java.util.Scanner;

public class Beak2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Case# : ");
		int t = sc.nextInt();
		if (1 <= t && t <= 1000) {
			for(int i=0;i<t;i++){
				int r = sc.nextInt();
				String x = sc.next();
				char[] chr = x.toCharArray();
				String result = "";
				
				for(int j=0;j<chr.length;j++){
					for(int k=0;k<r;k++){
						result += Character.toString(chr[j]);
					}
				}
				System.out.println(result);
			}
		}
	}

}
