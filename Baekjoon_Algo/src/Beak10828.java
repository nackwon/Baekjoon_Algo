import java.util.ArrayList;
import java.util.Scanner;

class MyStack {
	private int top;
	private ArrayList<Integer> stackarr;

	public MyStack() {
		stackarr = new ArrayList<Integer>();
		top = -1;
	}

	public void push(int n) {
		top++;
		stackarr.add(n);
	}

	public void pop() {
		if (top == -1)
			System.out.println(-1);
		else {
			System.out.println(stackarr.get(top));
			stackarr.remove(top);
			top--;
		}
	}

	public void size() {
		System.out.println(stackarr.size());
	}

	public void empty() {
		if (stackarr.isEmpty())
			System.out.println(1);
		else
			System.out.println(0);
	}

	public void top() {
		if (top == -1)
			System.out.println(-1);
		else
			System.out.println(stackarr.get(top));
	}
}

public class Beak10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MyStack stack = new MyStack();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			CheckStack(input, stack);
		}
	}

	public static void CheckStack(String input, MyStack mystack) {
		String command = input.substring(0, 3);
		if (command.equals("pus"))
			mystack.push(Integer.parseInt(input.split(" ")[1]));
		else if (command.equals("pop"))
			mystack.pop();
		else if (command.equals("emp"))
			mystack.empty();
		else if (command.equals("siz"))
			mystack.size();
		else if (command.equals("top"))
			mystack.top();
	}
}
