package j1.s.p0074;

public class Calculator {

    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] matrixResult = new int[row][col];
        //Traverse from first element row to last element row
        for (int i = 0; i < row; i++) {
            //Traverse from fisrt element column to last element column
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixResult;
    }

    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] matrixResult = new int[row][col];
        //Traverse from fisrt element row to last element row
        for (int i = 0; i < row; i++) {
            //Traverse from fisrt element column to last element column
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixResult;
    }

    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;
        int[][] matrixResult = new int[row1][col2];
        // Traverse from fisrt element row to last element row of matrix 1
        for (int i = 0; i < row1; i++) {
            // Traverse from fisrt element column to last element column of matrix 2
            for (int j = 0; j < col2; j++) {
                // Traverse from fisrt element column to last element column of matrix 1
                for (int k = 0; k < col1; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixResult;
    }
}
