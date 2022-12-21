package linkedlist;

import java.util.Scanner;

public class SingleLLDeletion {
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
		int data, n,m,p;
		Scanner s =  new Scanner(System.in);
		do {
			System.out.println("Enter Data ");
			data = s.nextInt();
			Node new_node = new Node(data);
			if(head == null) {
				head = new_node;
			}
			else {
				System.out.println("Enter 1 to Insert st Begining, 2  at End and 3 at Given Location ");
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
				System.out.println("Enter Position of Node to be Insert ");
				p = s.nextInt();
				Node temp1 = head;
				for(int i = 0; i < p-1; i++) {
					temp1 = temp1.next;
				}
				new_node.next = temp1.next;
				temp1.next = new_node;
				break;
			}
		}
			System.out.println("Do you want to add more data.If Yes , Press 1 or If NO press any No.");
			n = s.nextInt();	
		}
		while(n==1);
	}
	public void Delete() {
		int data, n,m,p;
		Scanner s =  new Scanner(System.in);
		do {
			if(head == null) {
				System.out.println("Linked list is Empty");
			}
			else {
				System.out.println("Enter 1 to delete at Begining, 2  at End and 3 at Given Location ");
				m = s.nextInt();
			
			switch(m) {
			case 1:
				Node temp = head;
				temp = temp.next;
				head = temp;
				break;
				
			case 2:
				Node temp1 = head;
				Node ptr = temp1.next;
				while(ptr.next != null) {
					temp1 = ptr;
					ptr = ptr.next;
				}
				temp1.next = null;
				break;
				
			case 3:
				System.out.println("Enter Position of Node to be Delete");
				p = s.nextInt();
				Node temp2 = head;
				Node ptr2 = temp2.next;
				for(int i = 0; i < p-2; i++) {
					temp = ptr2;
					ptr2 = ptr2.next;
				}
				temp2.next = ptr2.next;
				break;
			}
		}
			System.out.println("Do you want to add more data.If Yes , Press 1 or If NO press any No.");
			n = s.nextInt();	
		}
		while(n==1);
	}
	public void Traverser() {
		Node temp = head;
		if(head == null) {
			System.out.println("Linkes List dose not Exist");
		}
		else {
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		SingleLLDeletion slld = new SingleLLDeletion();
		
		slld.Creation();
		slld.Delete();
		slld.Traverser();
	}

}
