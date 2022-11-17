
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VICTUS
 */
public class BubbleSort {
    public static void main(String[] args) {
        //Step 1: User enter a positive decimal number as size of array
        int array_size = InputPositiveNumber();
        //Step 2: Create array by generate random interger in range of input
        int[] array = GenRandomArray(array_size);
        //Step 3: Display unsorted array
        displayArray("Unsorted array: ", array);
        //Step 4: Do Bubble Sort to sort array
        BubbleSort(array);
        //Step 5: Display sorted array
        displayArray("Sorted array: ", array);
        
//        //check interface
//        int array_size = InputPositiveNumber();
//        int[] arrayTestCase = {2, 6, 3, 6, 8, 6, 1, 2, 9, 8};
//        displayArray("Unsorted array: ", arrayTestCase);
//        BubbleSort(arrayTestCase);
//        displayArray("Sorted array: ", arrayTestCase);
        
//        //check funtion
//        int[] arrayTestCase = {5, 1, 12, -5, 16};
//        BubbleSortTestCase(arrayTestCase);
    }    

    private static int InputPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        String input;
        double array_size;
        
        //loops until user enter a positive number
        do {  
            try {
                System.out.println("Enter number of array: ");
                input = sc.nextLine().trim();
                //User enter nothing
                if(input.isEmpty()) {
                    System.err.println("Input can not be empty."
                            + "Please enter again.");
                    continue;
                }    
                array_size = Double.parseDouble(input);
                //User enter a negative number or 0
                if(array_size <= 0) {
                    System.err.println("Input can not be less or equal to 0."
                            + "Please enter again.");
                    continue;
                }
                //User enter a real number, if not return a interger number
                if((int)array_size != array_size) {
                    System.err.println("Input can not be a real number."
                            + "Please enter again");
                } else {
                    return (int) array_size;
                }
                //User enter a string
            } catch (NumberFormatException StringInput){
                System.err.println("Input can not be a string."
                        + "Plese enter again.");
                continue;
            }
        } while (true);
    }

    private static int[] GenRandomArray(int array_size) {
        int[] array = new int[array_size];
        Random rd = new Random();
        //loop to generate random interger elements in range of input
        for (int i = 0; i < array_size; i++) {
            array[i] = rd.nextInt(array_size);
        }
        return array;
    }

    private static void displayArray(String msg, int[] array) {
        int sizeOfArray = array.length;
        System.out.print(msg);
        System.out.print("[");
        
        //Loop prints out element of array
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(array[i]);
            //If current element is not the last element, print comma
            if(i < sizeOfArray - 1)
                System.out.print(", ");
        }
        //Prints out close brackets after display unsorted or sorted array
        if(msg.equals("Unsorted array: "))
            System.out.println("]");
        else
            System.out.print("]");
    }

    private static void BubbleSort(int[] array) {
        int arrayLength = array.length;
        /*First loop is to access from first element of the array 
        to the element before the last element of the array.
        After each loop, 1 element is sorted.
        */
        for (int i = 0; i < arrayLength - 1; i++) {
            /*Second loop is to access from first unsorted element of the array 
            to the element before the last unsorted element of the arrayy.
            */
            for (int j = 0; j < arrayLength - i - 1; j++) {
                //if current element is greater than next element, swap them
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    private static void BubbleSortTestCase(int[] array) {
        int arrayLength = array.length;
        boolean check = true;
        displayArrayTestCase(array, "unsorted");
        System.out.println("");
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    //display each step in sorting proccess in test case
                    if(check) {
                        displayArray("", array);
                        System.out.println("    " + array[j] + ">" + array[j + 1]
                                + ", " + "swap");
                    }
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else {
                    //display each step in sorting proccess in test case
                    displayArray("", array);
                    System.out.println("    " + array[j] + "<" + array[j + 1]
                            + ", " + "ok");
                }
                
            }
            System.out.println("");
        }
        displayArrayTestCase(array, "sorted");
    }
    
    private static void displayArrayTestCase(int[] array, String msg) {
        displayArray("", array);
        System.out.println("    " + msg);
    }    
}
