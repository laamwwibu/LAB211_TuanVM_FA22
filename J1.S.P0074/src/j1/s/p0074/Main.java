package j1.s.p0074;

public class Main {

    public static void main(String[] args) {
        GetDataInput getData = new GetDataInput();
        Calculator calculator = new Calculator();
        Display display = new Display();
        
        int[][] matrix1 = new int[0][0];
        int[][] matrix2 = new int[0][0];
        int[][] result = new int[0][0];

        while (true) {
            //1. Display a menu and ask users to select option
            showMenu();
            int choice = getData.getInputChoice(1, 4);
            display.displayMessage(choice);
            switch (choice) {
                //2. Addition matrixes
                case 1:
                    // Input matrix 1
                    matrix1 = getData.getInputMatrix(1, 0, 0, "addition");
                    // Input matrix 2
                    matrix2 = getData.getInputMatrix(2, matrix1.length, matrix1[0].length, "addition");
                    // Addition matrix 1 with matrix 2
                    result = calculator.additionMatrix(matrix1, matrix2);
                    //Display result
                    display.displayResult(matrix1, matrix2, result, "addition");
                    break;
                //3. Subtraction matrixes    
                case 2:
                    // Input matrix 1
                    matrix1 = getData.getInputMatrix(1, 0, 0, "subtraction");
                    // Input matrix 2
                    matrix2 = getData.getInputMatrix(2, matrix1.length, matrix1[0].length, "subtraction");
                    // subtraction matrix 1 with matrix 2
                    result = calculator.subtractionMatrix(matrix1, matrix2);
                    //Display result
                    display.displayResult(matrix1, matrix2, result, "subtraction");
                    break;
                //4. Multiplication matrixes
                case 3:
                    // Input matrix 1
                    matrix1 = getData.getInputMatrix(1, 0, 0, "multiplication");
                    // Input matrix 2
                    matrix2 = getData.getInputMatrix(2, matrix1.length, matrix1[0].length, "multiplication");
                    // multiplication matrix 1 with matrix 2
                    result = calculator.multiplicationMatrix(matrix1, matrix2);
                    //Display result
                    display.displayResult(matrix1, matrix2, result, "multiplication");
                    break;
                case 4:
                    //5. Exit program
                    System.exit(0);
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("=======Calculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.print("Your choice: ");
    }
}
