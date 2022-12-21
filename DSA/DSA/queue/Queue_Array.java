package queue;

import java.util.Scanner;

class QueueArray{
	int f = -1, r = -1;
	int n = 10;
	int q[] = new int [n];
	
	void Enqueue(Scanner sc) {
		if(r == (n-1)) {
			System.out.println("Overflow");
		}
		else {
			System.out.println("Enter Data");
			int i = sc.nextInt();
			if(f == -1 && r == -1) {
				f = 0;
				r = 0;
				q[r]= i;
			}
			else {
				r = r + 1;
				q[r]=i;
			}
		}
	}
	void Dequeue() {
		if(f == -1 && r == -1) {
			System.out.println("Underflow");
		}
		else {
			f = f+1;
		}
	}
	void Display() {
		System.out.println("Items are");
		for( int i = f; i <= r; i++) {
			System.out.println(q[i]);
		}
	}
}
public class Queue_Array {

	public static void main(String[] args) {
		int d;
		Scanner sc = new Scanner(System.in);
		QueueArray qa = new QueueArray();
		int l;
		do {
			System.out.println("Enter Your Choice");
			System.out.println("Press 1 to Equeue");
			System.out.println("Press 2 to Dequeue");
			System.out.println("Press 3 to Display");
			d = sc.nextInt();
			switch(d) {
			case 1:{
				qa.Enqueue(sc);
				break;
			}
			case 2:{
				qa.Dequeue();
				break;
			}
			case 3:{
				qa.Display();
				break;
			}
			}
			System.out.println("Enter 0 to go Back to the main menu ");
			System.out.println("Enter any key to exit");
			l = sc.nextInt();
		}
		while(l == 0);
	}

}
