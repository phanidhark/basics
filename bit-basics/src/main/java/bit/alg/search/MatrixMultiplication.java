package bit.alg.search;

public class MatrixMultiplication {
	static int a[][] ={{1,2},{3,4}};
	static int b[][] ={{4,5},{6,7}};
	public static void main(String[] args) {
		System.out.println("A Matrix:");
		printMatrix(a);
		System.out.println("B Matrix:");
		printMatrix(b);
		
		int[][] c =multiply(a, b);
		System.out.println("C Matrix:");
		printMatrix(c);
		
	}
	private static void printMatrix(int[][] m){
		for (int r = 0; r<m.length; r++) {
			for (int c = 0; c<m[r].length; c++) {
				System.out.print(m[r][c]+" ");
			}
			System.out.println("");
		}
			
	}
	private static int[][] multiply(int a[][], int b[][]){
		int rowA = a.length;
		int colA = a[0].length;
		int colB= b[0].length;
		int c[][] = new int[rowA][colA];
		for(int i=0;i<rowA;i++){
			for(int j=0;j<colB;j++){
				for(int k=0;k<colA;k++){
					c[i][j] = c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
	
}
