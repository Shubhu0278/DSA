package array;

import java.util.Scanner;

public class ArrayDeletElement {

	public static void main(String[] args) {
		int n,m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of Elements in Array ");
		n = s.nextInt();
		int arr[] = new int [n];
		int ary[] = new int [n-1];
		System.out.println("Enter Value ");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Eenter index of value to be deleted ");
		m = s.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(i< m) {
				ary[i] = arr[i];
			}
			else if(i == m) {
				continue;
			}
			else {
				ary[i-1] = arr[i];
			}
			
		}
		System.out.println("Elements are ");
		for(int i =0; i< n-1; i++) {
			System.out.println(ary[i]+" ");
		} 
				
	}

}
