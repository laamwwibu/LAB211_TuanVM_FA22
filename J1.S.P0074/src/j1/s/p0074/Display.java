package j1.s.p0074;

public class Display {

    public void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        //Traverse from fisrt element row to last element row
        for (int i = 0; i < row; i++) {
            //Traverse from fisrt element column to last element column
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    void displayResult(int[][] matrix1, int[][] matrix2, int[][] result, String string) {
        System.out.println("--------Result--------");
        //show result of addtion matrix
        if ("addition".equals(string)) {
            displayMatrix(matrix1);
            System.out.println("+");
            displayMatrix(matrix2);
            System.out.println("=");
            displayMatrix(result);
        }
        //show result of subtraction matrix
        if ("subtraction".equals(string)) {
            displayMatrix(matrix1);
            System.out.println("-");
            displayMatrix(matrix2);
            System.out.println("=");
            displayMatrix(result);
        }
        //show multiplication of addtion matrix
        if ("multiplication".equals(string)) {
            displayMatrix(matrix1);
            System.out.println("*");
            displayMatrix(matrix2);
            System.out.println("=");
            displayMatrix(result);
        }
    }

    void displayMessage(int choice) {
        if (choice == 1) {
            System.out.println("--------Addition--------");
        }
        if (choice == 2) {
            System.out.println("--------Subtraction--------");
        }
        if (choice == 3) {
            System.out.println("--------Multiplication--------");
        }
    }
}
