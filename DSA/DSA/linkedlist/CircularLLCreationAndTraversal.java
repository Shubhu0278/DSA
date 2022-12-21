package linkedlist;

import java.util.Scanner;

public class CircularLLCreationAndTraversal {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = next;
		}
	}
		Node head = null;
		Node tail = null;
		
		public void Creation() {
			int data,n;
			Scanner s = new Scanner(System.in);
			do {
				System.out.println("Enter Data ");
				data = s.nextInt();
				Node new_node = new Node(data);
				if(head == null) {
					head = new_node;
					tail = new_node;
					new_node.next = head;
				} 
				else {
					new_node.next = head;
					head = new_node;
					tail.next = head; 
				}
				System.out.println("Do you want to add more data. If Yes, press 1 or No press any No.");
				n = s.nextInt();
			}
			while(n == 1);
		}
		public void Traverser() {
			Node temp = head;
			if(head == null) {
				System.out.println("Linked List does not Exit");
			}
			else {
				do {
					System.out.println(temp.data+" ");
					temp = temp.next;
				}
				while(temp != null);
			}
		}

	public static void main(String[] args) {
		CircularLLCreationAndTraversal cllct = new CircularLLCreationAndTraversal();
		cllct.Creation();
		cllct.Traverser();
	}

}
