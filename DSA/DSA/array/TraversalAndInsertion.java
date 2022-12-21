package array;

import java.util.Scanner;

public class TraversalAndInsertion {

	public static void main(String[] args) {
		int n,m,p;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of Element in array ");
		n = s.nextInt();
		int arr[] = new int[n];
		int ary[] = new int [n+1];     // insert a new array
		
		System.out.println("Enter Values ");
		for(int i=0; i<n; i ++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter index of new value to be inserted ");
		m = s.nextInt();
		System.out.println("Enter new value to be inserted ");
		p = s.nextInt();
		
		for(int i=0; i<n+1; i++) {      //Insertion
			if(i<m) {
				ary[i]=arr[i]; 
			}
			else if(i == m) {
				ary[i] = p;
			}
			else {
				ary[i]=arr[i-1];
			}
		}
		System.out.println("Elements are ");
		for(int i=0; i<n; i++) {
			System.out.print(ary[i]+" ");
		}
	}

}
