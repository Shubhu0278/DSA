package array;



public class TwoDGrAndSm {

	public static void main(String[] args) {
		int gr,sm;
		int arr[][] = new int[][] {{2,5},{4,6},{9,7},{3,8}};
//   for(int i=0; i<4; i++) {		
//	for(int j=0; i<4; j++) {
//				
//			}	
//	}
		gr = arr[0][0];
		sm = arr[0][0];	
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(arr[i][j] > gr)
					gr = arr[i][j];
				if(arr[i][j] < sm)
					sm = arr[i][j];
			}
			System.out.println("Greatest Number:- "+gr);
			System.out.println("Smallest Number:- "+sm);
		}
//		System.out.println("Greatest Number:- "+gr);
//		System.out.println("Smallest Number:- "+sm);
	}

}
