package stack;

import java.util.Scanner;

class Stack1{
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = next;
		}
	}
	Node top = null;
	
	Scanner sc = new Scanner(System.in);
	void Push() {
		System.out.println("Enter Data ");
		int data = sc.nextInt();
		Node new_node  = new Node(data);
		if(top == null) {
			top = new_node;
		}
		else {
			new_node.next = top;
			top = new_node;
		}
	}
	void Pop() {
		if(top == null) {
			System.out.println("Stack is Empty ");
		}
		else {
			top = top.next;
		}
	}
	void Display() {
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
public class StackLL {

	public static void main(String[] args) {
		int d;
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		int l;
		do {
			System.out.println("Press 1 to Push");
			System.out.println("Press 2 to Pop");
			System.out.println("Press 3 to Display");
			//System.out.println("Enter Your choice");
			
			d = sc.nextInt();
			switch(d) {
			case 1:{
				s.push();
				break;
			}
			case 2:{
				s.pop();
				break;
			}
			case 3:{
				s.display();
				break;
			}
			}
			System.out.println("Enter 0 to go back main menu ");
			System.out.println("Enter any key to exit");
			l = sc.nextInt();
		}
		while(l == 0);
		System.out.println("Exit");
	}

}


