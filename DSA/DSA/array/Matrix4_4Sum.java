package array;

import java.util.Scanner;

public class Matrix4_4Sum {

	public static void main(String[] args) {
		int n,m,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row- ");
		n = s.nextInt();
		System.out.println("Enter Column- ");
		m = s.nextInt();
		
		int a[][] = new int [n][m];
		System.out.println("Enter Values- ");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = s.nextInt();
			
			}
			
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(a[i][j]+" ");
	
				sum = sum + a[i][j];
			}
			System.out.println("-->> "+sum);
		}
	}

}
