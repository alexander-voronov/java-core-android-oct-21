package ru.geekbrains.jca.lessons.l9;

public class InputArray {

    public static final int SIZE = 4;

    public static int inputConvertSum(String[][] arr) {
        if (arr.length != SIZE) {
            throw new MyArraySizeException("Array of different size!");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new MyArraySizeException("Array of different size!");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Incorrect data in cell No. [%d][%d]", i + 1, j + 1));
                }
            }
        }
        System.out.println("The sum is " + sum);
        return sum;
    }
}
