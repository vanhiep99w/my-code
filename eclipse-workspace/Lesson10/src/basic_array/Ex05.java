package basic_array;



public class Ex05 {

	public static void main(String[] args) {
		int[][] matrix=new int[3][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[2][0] = 5;
		matrix[2][1] = 6;
		for(int row=0;row<matrix.length;row++) {
			for(int col=0;col<matrix[row].length;col++) {
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
		
		int [][][] tripleMatrix= {{{1,2,3}}};
	}
}
