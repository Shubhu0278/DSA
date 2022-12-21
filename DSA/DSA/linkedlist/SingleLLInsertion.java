package linkedlist;

import java.util.Scanner;

public class SingleLLInsertion {
	static class Node{
		int data;
		Node next;
		
		Node (int data){
			this.data = data;
			this.next = next;
		}
	}
		Node head = null;
		public void Creation() {
			int data,n,m,p;
			Scanner s = new Scanner(System.in);
			do {
				System.out.println("Enter Data ");
				data = s.nextInt();
				Node new_node = new Node(data);
				if(head == null) {
					head = new_node;     //10
				}
				else {
					System.out.println("Enter 1 to Insert at Beginig, 2 at End and 3 at Given Location");
					m = s.nextInt();
					switch(m) {
					case 1:
						new_node.next = head;
						head = new_node;
						break;
						
					case 2:
						Node temp = head;
						while(temp.next != null) {
						temp = temp.next;
						}
						temp.next = new_node;
						break;
						
					case 3:
						System.out.println("Enter position of node to be Inserted ");
						p = s.nextInt();
						Node temp1 = head;
						for(int i = 0; i < p-2; i++) {
							temp1 = temp1.next;
						}
						new_node.next = temp1.next;
						temp1.next = new_node;
					}
				}
				System.out.println("Do you want to add more data.If Yes , Press 1 or If NO press any No.");
				n = s.nextInt();			
			}
			while(n==1);
		}
		public void traverser() {
			Node temp = head;
			if(head == null) {
				System.out.println("Linked List dose not Exist ");
			}
			else {
				while(temp != null) {
					System.out.println(temp.data);
					temp = temp.next;
				}
			}
		}
	public static void main(String[] args) {
		SingleLLInsertion slli = new SingleLLInsertion();
		
		slli.Creation();
		slli.traverser();
				
	}

}
