/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20/08/21
 *   Time: 4:51 PM
 *   File: PracticeCode10.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to enter text.
 2. Program format text with the next rules:
    i. all characters in word should become lower case.
    ii. the first letter in the word should become upper case.
 3. Program prints result of formatted text to the console.
  */


package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Scanner;

public class PracticeCode10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();


        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {
        StringBuilder resultantTitle = new StringBuilder();
        string = string.toLowerCase();
        for (int index = 0; index < string.length(); index++) {
            char character = string.charAt(index);
            if (index == 0) {
                resultantTitle.append(String.valueOf(character).toUpperCase());
            } else if (string.charAt(index - 1) < 97 || string.charAt(index - 1) > 122) {
                resultantTitle.append(String.valueOf(character).toUpperCase());
            } else {
                resultantTitle.append(character);
            }
        }
        return resultantTitle.toString();
    }
}
