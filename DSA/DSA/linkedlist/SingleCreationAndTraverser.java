package linkedlist;

import java.util.Scanner;

public class SingleCreationAndTraverser {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = next;
		}
	}
		Node head = null;
		public void Creation() {
			int data,n;
			Scanner s = new Scanner(System.in);
			do {
				System.out.println("Enter Data ");
				data = s.nextInt();
				Node new_node = new Node(data);
				if(head==null) {
					head = new_node;
				}
				else {
					new_node.next = head;
					head = new_node;
				}
				System.out.println("Do you want to add more data.If Yes , Press 1 or If NO press any No.");
				n = s.nextInt();
			}
			while(n==1);
		}
		public void traverser() {
			Node temp = head;
			if(head == null) {
				System.out.println("Linked List does not Exist ");
			}
			else {
				while(temp != null) {
					System.out.println(temp.data);
					temp = temp.next;
				}
			}
		}
	
	public static void main(String[] args) {
		SingleCreationAndTraverser st = new SingleCreationAndTraverser();
		
		st.Creation();
		st.traverser();
	}

}
