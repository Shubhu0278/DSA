package array;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
/*		int i, sum=0;
		int a[] = new int[] {5,2,3,4,6,7};
		for(i = 0; i < a.length; i++) {
			
			sum = sum + a[i];
		}
		System.out.println("Sum of element is:- "+sum);
	*/	
		
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Size of Array:- ");
		n = s.nextInt();
		System.out.print("Enter Elements:- ");
		int a[] = new int[n];
		for(int i=0; i< n; i++) {
			a[i]=s.nextInt();
			sum = sum + a[i];
		}
		System.out.print("Sum of Elements is:- "+sum);
	}

}
