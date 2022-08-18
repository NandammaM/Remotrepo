package Task4;

public class Addtwomatrices {
	
	static void printMatrix(int M[][], int rowsize,int colsize) {
		
		for(int i=0;i<rowsize;i++) {
			for (int j = 0; j < colsize; j++) {
				System.out.print(M[i][j]+" ");
				
			}
			System.out.println();
		}
	}
		
		static int[][] add(int A[][], int B[][], int size){
			
			int c[][] = new int[size][size];
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					c[i][j] = A[i][j] + B[i][j];
					
					
				}
				
			}
			return c;
			
		}
	
	
	public static void main(String[] args) {
		
		int size= 4;
		int A[][] = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{3,2,3,1}};
		System.out.println("\nMatrix A:");
		printMatrix(A, size, size);
		
		int B[][] = {{2,3,4,1},
				{0,6,7,5},
				{9,6,7,4},
				{9,4,6,5}};
		System.out.println("\nMatrix B:");
		printMatrix(B, size, size);
		
		int C[][] = add(A, B, size);
		
		System.out.println("\nResultant Matrix");
		printMatrix(C, size, size);
		
	}

}
