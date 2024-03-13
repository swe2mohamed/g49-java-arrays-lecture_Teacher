package se.lexicon;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        ex3();
    }

    // sort() & toString()
    public static void ex1() {
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
        int[] numbers = {6, 8, 7, 4, 9, 11};
        // Arrays.sort(names);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        // Arrays.sort(names, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println(Arrays.toString(names));
    }

    // binarySearch()
    public static void ex2() {
        int[] numbers = {700, 900, 200, 4555, 34500, 445000, 600000};
        Arrays.sort(numbers); // [200, 700, 900, 4555, 34500, 445000, 600000]
        int index = Arrays.binarySearch(numbers, 900); // it returns a negative number if value does not exist in array
        System.out.println(index);
        if (index < 0) { // negative number
            System.out.println("Data Not Found.");
        } else {
            System.out.println("index of numbers[" + index + "] = " + numbers[index]);
        }
    }

    public static void ex3() {
        char[] letters = {'J', 'A', 'V', 'A'}; // [L,A,V,A]

        char[] referenceToOriginalArray = letters; // [L,A,V,A]
        char[] copyOfTheOriginalArray = Arrays.copyOf(letters, letters.length); // [J,A,V,A]
        letters[0] = 'L';
        System.out.println("Original Array: " + Arrays.toString(letters));  // Java

        System.out.println("Reference To Original Array: " + Arrays.toString(referenceToOriginalArray)); // Java
        System.out.println("Copy Of The Original Array: " + Arrays.toString(copyOfTheOriginalArray)); // Java
    }


}
