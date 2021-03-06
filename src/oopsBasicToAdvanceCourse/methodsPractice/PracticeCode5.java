/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 10/08/21
 *   Time: 12:01 AM
 *   File: PracticeCode5.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to specify matrix size. For example if user entered '5' program will generate next matrix.
 2. Program asks user this question with options:
    How much do you want to rotate matrix?
  - Press 1 to rotate matrix to 90 degrees
  - Press 2 to rotate matrix to 180 degrees
  - Press 3 to rotate matrix to 270 degrees
 3. When user chosen rotation mode programs prints initial matrix and rotated one.
  */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PracticeCode5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        float[][] matrix = generateMatrix(size);

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");
        int mode = in.nextInt();

        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        if (rotateMatrix(matrix, mode)) {
            printMatrixToConsole(matrix);
        }
    }

    public static float[][] generateMatrix(int size) {
        float[][] resultantMatrix = new float[size][size];
        DecimalFormat decimalFormat = new DecimalFormat("#.#");


        for (int i = 0; i < size; i++) {
            float matrixValue = (float) i;
            for (int j = 0; j < size; j++) {
                resultantMatrix[i][j] = Float.parseFloat(decimalFormat.format(matrixValue));
                matrixValue += 0.1;
            }
        }
        return resultantMatrix;
    }

    public static void printMatrixToConsole(float[][] matrix) {
        for (float[] floats : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(floats[j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean rotateMatrix(float[][] matrix, int mode) {
        switch (mode) {
            case 1 -> {
                System.out.println("90 degrees rotated:" + System.lineSeparator());
                rotate90(matrix);
            }
            case 2 -> {
                System.out.println("180 degrees rotated:" + System.lineSeparator());
                rotate180(matrix);
            }
            case 3 -> {
                System.out.println("270 degrees rotated:" + System.lineSeparator());
                rotate270(matrix);
            }
            default -> {
                System.err.println("You selected non-existing mode!!");
                return false;
            }
        }
        return true;
    }

    public static void transposeMatrix(float[][] matrix) {
        float temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void verticalReflection(float[][] matrix) {
        float temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static void horizontalReflection(float[][] matrix) {
        float temp;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][j];
                matrix[matrix.length - 1 - i][j] = temp;
            }
        }
    }

    public static void rotate90(float[][] matrix) {
        transposeMatrix(matrix);
        verticalReflection(matrix);
    }

    public static void rotate180(float[][] matrix) {
        rotate90(matrix);
        rotate90(matrix);
    }

    public static void rotate270(float[][] matrix) {
        rotate180(matrix);
        rotate90(matrix);
    }
}
