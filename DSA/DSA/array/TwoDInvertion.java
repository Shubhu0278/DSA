package array;

import java.util.Scanner;

public class TwoDInvertion {

	public static void main(String[] args) {
		int n,m,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of ROW ");
		n = s.nextInt();
		System.out.println("Enter number of COLUMNS ");
		m = s.nextInt();
		
		int a[][] = new int [n][m];
		System.out.println("Enter values ");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
/*		int a[][] ={{1,3},{5,7},{6,4}};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(a[i][j]+"    ");
			}
			System.out.println();
		}
		*/
	}

}
