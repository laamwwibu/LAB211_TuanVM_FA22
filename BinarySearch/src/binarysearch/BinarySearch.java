/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class BinarySearch {

    public static void main(String[] args) {
        //Step 1: User enter a positive decimal number as size of array
        int arraySize = InputPositiveNumber();
        //Step 2: Create array by generate random interger in range of input
//        int[] array = GenRandomArray(arraySize);
        int[] array = {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114};
        //Step 3: User User enter a positive decimal number to search
        int searchValue = inputSearchValue();
        //Step 4: Do Bubble Sort to sort array
        BubbleSort(array);
        //Step 5: Display sorted array
        displayArray("Sorted array: ", array);
        //Step 5: Do Binary Search recursively
        int startIndex = 0;
        int endIndex = array.length - 1;
//        BinarySearch(array, searchValue, startIndex, endIndex);
        BinarySearchIterative(array, searchValue, startIndex, endIndex);
        //Step 6: Display Index of 
        displayIndex(array, searchValue, startIndex, endIndex);
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
                if (input.isEmpty()) {
                    System.err.println("Input can not be empty."
                            + "Please enter again.");
                    continue;
                }
                array_size = Double.parseDouble(input);
                //User enter a negative number or 0
                if (array_size <= 0) {
                    System.err.println("Input can not be less or equal to 0."
                            + "Please enter again.");
                    continue;
                }
                //User enter a real number, if not return a interger number
                if ((int) array_size != array_size) {
                    System.err.println("Input can not be a real number."
                            + "Please enter again");
                } else {
                    return (int) array_size;
                }
                //User enter a string
            } catch (NumberFormatException StringInput) {
                System.err.println("Input can not be a string."
                        + "Plese enter again.");
                continue;
            }
        } while (true);
    }

    private static int[] GenRandomArray(int arraySize) {
        int[] array = new int[arraySize];
        Random rd = new Random();
        //loop to generate random interger elements in range of input
        for (int i = 0; i < arraySize; i++) {
            array[i] = rd.nextInt(arraySize);
        }
        return array;
    }

    private static int inputSearchValue() {
        Scanner sc = new Scanner(System.in);
        String input;
        double searchValue;

        //loops until user enter a positive number
        do {
            try {
                System.out.println("Enter search value: ");
                input = sc.nextLine().trim();
                //User enter nothing or whitespace
                if (input.isEmpty()) {
                    System.err.println("Input can not be empty.");
                    continue;
                }
                searchValue = Double.parseDouble(input);
                //User enter a negative number
                if (searchValue < 0) {
                    System.out.println("Input can not be negative");
                }
                //User enter 0
                if (searchValue == 0) {
                    System.out.println("Input can not be 0");
                }
                //User enter a real number, if not return a interger number
                if ((int) searchValue != searchValue) {
                    System.err.println("Input can not be a real number.");
                } else {
                    return (int) searchValue;
                }
                //User enter a string
            } catch (NumberFormatException StringInput) {
                System.err.println("Input can not be a string.");
                continue;
            }
        } while (true);
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
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void displayArray(String msg, int[] array) {
        int sizeOfArray = array.length;
        System.out.print(msg);
        System.out.print("[");

        //Loop prints out element of array
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(array[i]);
            //If current element is not the last element, print comma
            if (i < sizeOfArray - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    //recursively
    private static int BinarySearch(int[] array, int searchValue,
            int startIndex, int endIndex) {
        if(endIndex >= startIndex) {
            int midIndex = (endIndex + startIndex) / 2;
            /*value at miIndex is equal to searchValue then
            index of search value is midIndex*/
            if(array[midIndex] == searchValue) {
                
                return midIndex;
            }
            /*value at midIndex is less than searchValue then
            searchValue in in the right side of the array*/
            else if(array[midIndex] < searchValue) {
                return BinarySearch(array, searchValue, midIndex + 1, endIndex);
            }
            /*value at midIndex is greater than searchValue then
            searchValue in in the left side of the array*/
            else {
                return BinarySearch(array, searchValue, startIndex, midIndex - 1);
            }
        }
        //searchVlaue is not in the array
        return -1;
    }
    
    private static void displayTestCase(int[] array, int searchValue,
            int startIndex, int endIndex) {
        int midIndex = (endIndex + startIndex) / 2;
        int steps = 1;
        if(array[midIndex] == searchValue) {
            System.out.print("Step " + steps + " (middle element is "
                        + array[midIndex] + "==" + searchValue + "):");
            for (int i = 0; i <= endIndex; i++) {
                System.out.print(array[i] + " ");
            }
        }
        if(array[midIndex] < searchValue) {
            System.out.print("Step " + steps + " (middle element is "
                        + array[midIndex] + "<" + searchValue + "):");
            for (int i = midIndex + 1; i <= endIndex ; i++) {
                System.out.print(array[i] + " ");
            }
        }
        if(array[midIndex] > searchValue) {
            System.out.print("Step " + steps + " (middle element is "
                        + array[midIndex] + ">" + searchValue + "):");
            for (int i = startIndex; i <= midIndex - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }  
        steps++;
    }
    
//    private static int BinarySearch(int[] array, int searchValue,
//            int startIndex, int endIndex) {
//        while(endIndex >= startIndex) {
//            int midIndex = (endIndex + startIndex) / 2;
//            /*value at miIndex is equal to searchValue then
//            index of search value is midIndex*/
//            if(array[midIndex] == searchValue) {
//                displayTestCase(array, searchValue, startIndex, endIndex);
//                return midIndex;
//            }
//            /*value at midIndex is less than searchValue then
//            searchValue in in the right side of the array*/
//            else if(array[midIndex] < searchValue) {
//                displayTestCase(array, searchValue, startIndex, endIndex);
//                return BinarySearch(array, searchValue, midIndex + 1, endIndex);
//            }
//            /*value at midIndex is greater than searchValue then
//            searchValue in in the left side of the array*/
//            else {
//                displayTestCase(array, searchValue, startIndex, endIndex);
//                return BinarySearch(array, searchValue, startIndex, midIndex - 1);
//            }   
//        }
//        //searchVlaue is not in the array
//        return -1;
//    }
    
    private static int BinarySearchIterative(int[] array, int searchValue, int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            int steps = 1;
            /*value at miIndex is equal to searchValue then
            index of search value is midIndex*/
            if(array[midIndex] == searchValue) {
                steps++;
                System.out.print("Step " + steps + " (middle element is "
                        + array[midIndex] + "==" + searchValue + "):");
                return midIndex;
            }
            /*value at midIndex is less than searchValue then
            searchValue in in the right side of the array*/
            if(array[midIndex] < searchValue) {
                steps++;
                System.out.print("Step " + steps + " (middle element is "
                        + array[midIndex] + "<" + searchValue + "):");
                startIndex = midIndex + 1;
            }
            /*value at midIndex is greater than searchValue then
            searchValue in in the left side of the array*/
            if(array[midIndex] > searchValue) {
                steps++;
                System.out.print("Step " + steps + " (middle element is "
                        + array[midIndex] + ">" + searchValue + "):");
                endIndex = midIndex - 1;
            }
        }
        //searchVlaue is not in the array
        return -1;
    }

    private static void displayIndex(int[] array, int searchValue,
            int startIndex, int endIndex) {
        int foundIndex = BinarySearch(array, searchValue, startIndex, endIndex);
        //searchValue is not in the array
        if (foundIndex == -1) {
            System.out.println(searchValue + " is not in the array.");
        } else {
            System.out.println("Found " + searchValue + " at index: " + foundIndex);
        }
    }
}
