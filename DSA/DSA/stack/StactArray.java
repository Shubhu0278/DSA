package stack;

import java.util.Scanner;

class Stack{
	int top = -1;
	int n = 10;
	int a[]= new int [n];
	
	Scanner sc = new Scanner(System.in);	
	void Push() {
		if(top == (n-1)) {
			System.out.println("Stack Overflow");
		}
		else {
			System.out.println("Enter Data");
			int i = sc.nextInt();
			top = top + 1;
			a[top] = i;
			System.out.println("Item Inserted");
		}
	}
	void Pop() {
		if(top == -1) {
			System.out.println("Stack Underflow");
		}
		else {
			top = top -1;
			System.out.println("Item Deleted");
		}
	}
	void Display() {
		System.out.println("Items are");
		for(int j=top; j>=0; j--) {
			System.out.println(a[j]);
		}
	}
}

public class StactArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		int l,d;
		do {
			System.out.println("Enter your choice");
			System.out.println("Press 1 to Push");
			System.out.println("Press 2 to Pop");
			System.out.println("Press 3 to Display");
			
			d = sc.nextInt();
			switch(d) {
			case 1:{
				s.Push(sc);
				break;
				
			}
			case 2:{
				s.Pop(sc);
				break;
			}
			case 3;{
			}
			
		}
		while(0);
		
		}

}

