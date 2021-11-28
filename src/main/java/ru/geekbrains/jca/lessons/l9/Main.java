package ru.geekbrains.jca.lessons.l9;

public class Main {

    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"1", "2", "3", "4"},
                {"x", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        try {
            InputArray.inputConvertSum(arr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }
}
