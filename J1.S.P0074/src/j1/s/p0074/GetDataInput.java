package j1.s.p0074;

import java.util.Scanner;

public class GetDataInput {

    public int getInputChoice(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String raw = scanner.nextLine().trim();
            raw = raw.replace("\\s+", "");
            // not empty ~> check next condition
            if (!raw.isEmpty()) { 
                try {
                    int choice = Integer.parseInt(raw);
                    if (choice >= min && choice <= max) {
                        return choice;
                    } else {
                        System.out.print("Choice must in range [" + min + "-"
                                + max + "], enter again: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Choice must be an integer, enter again: ");
                }
                // empty string ~> display error & re-enter
            } else { 
                System.out.print("Choice can not empty, enter again: ");
            }
        }
    }

    public int getInputInt(String mgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(mgs);
            String raw = scanner.nextLine().trim();
            try {
                if (raw.isEmpty()) {
                    System.out.println("Input value is empty!");
                    continue;
                }
                
                int num = Integer.parseInt(raw);
                if (Integer.parseInt(raw) == Integer.parseInt(raw)) {
                    return num;
                }
            } catch (Exception e) {
                System.out.println("Value of matrix is digit");
            }
        }
    }

    public int getInputSize(String mgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(mgs);
            String raw = scanner.nextLine().trim();
            try {
                if (raw.isEmpty()) {
                    System.out.println("Input is empty!");
                    continue;
                }
                int num = Integer.parseInt(raw);
                //check size matrix positve
                if (num > 0) {
                    return num;
                } else {
                    System.out.println("Size of matrix is a positive integer number!, enter again: ");
                }
            } catch (Exception e) {
                System.out.println("Size of matrix must be a number!, enter again: ");
            }
        }
    }
    
    public int[][] getInputMatrix(int ordinalNumber, int row, int col, String choice) {
        GetDataInput in = new GetDataInput();

        int newRow = 0, newCol = 0;
        //choose option addition matrix or subtraction matrix
        if (choice.equals("addition") || choice.equals("subtraction")) {
            newRow = in.getInputSize("Enter Row Matrix " + ordinalNumber + ":");
            //check input row matrix 2 with matrix 1
            while (newRow != row && ordinalNumber == 2) {
                System.out.println("Row Matrix " + ordinalNumber + " should be equal Row Matrix 1");
                newRow = in.getInputSize("Enter Row Matrix " + ordinalNumber + " again:");
            }

            newCol = in.getInputSize("Enter Colum Matrix " + ordinalNumber + ":");
            //check input column matrix 2 with matrix 1
            while (newCol != col && ordinalNumber == 2) {
                System.out.println("Colum Matrix " + ordinalNumber + " should be equal Colum Matrix 1");
                newCol = in.getInputSize("Enter Colum Matrix " + ordinalNumber + " again:");
            }
        } 
        //option multiplication
        else if (choice.equals("multiplication")) {
            newRow = in.getInputSize("Enter Row Matrix" + ordinalNumber + ":");
            //check column matrix 2 equal with row matrix 1
            while (newRow != col && ordinalNumber == 2) {
                System.out.println("Row Matrix " + ordinalNumber + " should be equal Colum Matrix 1");
                newRow = in.getInputSize("Enter Row Matrix " + ordinalNumber + " again:");
            }
            newCol = in.getInputSize("Enter Colum Matrix " + ordinalNumber + ":");
        }

        int[][] matrix = new int[newRow][newCol];
        //Traverse from fisrt element new row to last element new row
        for (int i = 0; i < newRow; i++) {
            //Traverse from fisrt element of new column to last element of new column
            for (int j = 0; j < newCol; j++) {
                matrix[i][j] = in.getInputInt("Enter Matrix" + ordinalNumber + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:");
            }
        }
        return matrix;
    }
}
