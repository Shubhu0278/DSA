package array;
import java.util.Scanner;

public class ArrayUser {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of Elements ");
		n = s.nextInt();
		int arr[] = new int [n];
		for(int i = 0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Print Array ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
