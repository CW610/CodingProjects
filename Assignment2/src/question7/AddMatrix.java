package question7;

public class AddMatrix {

	public static void main(String[] args) {
		int rows = 2, col = 3;
        int[][] ma1 = { {2, 3, 4}, {5, 2, 3} };
        int[][] ma2 = { {-4, 5, 3}, {5, 6, 3} };

        // Reading through the rows, then the columns, and adding them together
        int[][] sum = new int[rows][col];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = ma1[i][j] + ma2[i][j];
            }
            
           //read through the sum and make new rows and columns with the sum value
            // then print to console
            System.out.println("Sum of two matrices is: ");
            for(int[] row : sum) {
                for (int colu : row) {
                    System.out.print(colu + "    ");
                }
                System.out.println();
            }
        }
        }
	}


