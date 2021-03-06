/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 02/08/21
 *   Time: 11:26 PM
 *   File: PracticeCode1.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to input integer numbers separated by space.
 2. Program creates and array object with entered numbers.
 3. Program calls specific method which takes int[] as a parameter and returns max value in this array.
 4. Program prints max value from the array to the console.
  */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeCode1 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");
        for (int index = 0; index < intArray.length; index++) {
            intArray[index] = sc.nextInt();
        }

        int maxInt = findMaxIntInArray(intArray);
        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*** Max number in array ***");
        System.out.println(maxInt);
    }


    public static int findMaxIntInArray(int[] intArray) {
		int maxInt = intArray[0];
        for (int index = 1; index < intArray.length; index++) {
            if (maxInt < intArray[index]) {
                maxInt = intArray[index];
            }
        }
		return maxInt;
    }

}
