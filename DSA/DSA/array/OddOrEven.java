package array;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int odd = 0, even = 0, n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of Array:- ");
		n = s.nextInt();
		System.out.print("Enter Element:- ");
		int arr[] = new int [n];
		for(int i=0; i < n; i++) {
			arr[i]=s.nextInt();
			
			if(arr[i] % 2 == 0)
				even = even + arr[i];
			else
				odd = odd + arr[i];
		}
		System.out.println("Even number is:- "+even);
		System.out.println("Odd number is:- "+odd);
	}

}
