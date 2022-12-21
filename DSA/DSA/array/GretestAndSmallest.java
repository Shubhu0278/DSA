package array;

import java.util.Scanner;

public class GretestAndSmallest {

	public static void main(String[] args) {
		int gr,sm,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of Array ");
		n = s.nextInt();
		int arr[] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		gr = sm = arr[0];
		for( int i=1; i<n; i++) {
			if(arr[i] > gr)
				gr = arr[i];
			if(arr[i] < sm)
				sm = arr[i];
		}
		System.out.println("Gretest is:- "+gr);
		System.out.println("Smallest is:- "+sm);
	}

}
