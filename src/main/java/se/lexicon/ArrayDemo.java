package se.lexicon;

public class ArrayDemo {

    public static void main(String[] args) {

        /*
        int number;

        // initialization & declaration of arrays
        int[] numbers = new int[3]; // [0, 0, 0]
        String[] stringArrays = new String[4]; // [null, null, null, null]

        int[] numbers2 = new int[]{9, 22};// [9, 22]
        int[] numbers3 = {5, 10, 45, 79}; // [5, 10, 45, 79]
        char[] letters = {'J','A','V','A'}; // [J,A,V,A]
        String[] daysOfWeek = {"Monday", "Tuesday"};
        */

        ex5();
    }


    // initializing & accessing using indexing
    public static void ex1() {
        String[] names = new String[3]; // [null, null, null]
        System.out.println(names.length); // 3
        names[0] = "Fredrik"; // ["Fredrik", null, null]
        names[2] = "Jonas"; // ["Fredrik", null, "Jonas"]

        System.out.println(names[0]); // Fredrik
        System.out.println(names[1]); // null
        //System.out.println(names[5]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

    }

    // indexing and iteration
    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7}; // 5
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("----------------");
        numbers[1] = 4; // [5, 4, 3, 4, 7]

        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Expanding Arrays
    public static void ex3() {
        int[] originalArray = {2, 5, 8, 1, 9}; // 5
        int newNumber = 7;
        int[] newArray = new int[originalArray.length + 1]; // [0,0,0,0,0,0]
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];// [2,5,8,1,9,0]
        }

        printArrays(newArray);
        newArray[newArray.length - 1] = newNumber;
        printArrays(newArray);
        System.out.println();
    }

    public static void printArrays(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Finding the Maximum Number of Arrays
    public static void ex4() {
        int[] numbers = {5, 2, 3, 4, 7}; // 7
        // How to find Max number in the given array?
        // Initialize a maxNumber with the first element of the array
        int maxNumber = numbers[0]; // 5

        // Iterate through the array to find the maximum number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber){ // 7 > 5 Y ->
                maxNumber = numbers[i]; // maxNumber = 7
            }
        }
        System.out.println("maxNumber = " + maxNumber);
    }

    // 2D Arrays
    public static void ex5(){

        // ["X"]["X"]["O"]
        // ["X"]["O"]["X"]
        // ["O"]["X"]["X"]

        String[][] board = new String[3][3];
        // [null][null][null]
        // [null][null][null]
        // [null][null][null]

        board[0][0] = "X";
        board[0][1] = "X";
        board[0][2] = "O";

        board[1][0] = "X";
        board[1][1] = "O";
        board[1][2] = "X";

        board[2][0] = "O";
        board[2][1] = "X";
        board[2][2] = "X";

        for (int i = 0 ; i< board.length ; i++){
            for (int j = 0 ; j < board[i].length ; j++){
                System.out.print( board[i][j] +  "\t"); // []
            }
            System.out.println("\n");
        }

    }

    // How to Sort the given array in ascending order?
    public static void ex6(){
        int[] numbers = {5, 2, 3, 4, 7};
        // todo: implement it after the lecture :)
    }



}
