import java.util.Scanner;


public class Beak10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char[] inputs = sc.next().toCharArray();
		boolean[] visited = new boolean[26];
		int[] results = new int[26];
		
		for(int i=0;i<results.length;i++){
			results[i] = -1;
		}
		
		for(int i=0;i<inputs.length;i++){
			int a = (int)(inputs[i]-'a');
			if(visited[a] == false){
				results[a] = i;
				visited[a] = true;
			}
		}
		for(int i=0;i<results.length;i++){
			System.out.print(results[i]+" ");
		}
	}

}
