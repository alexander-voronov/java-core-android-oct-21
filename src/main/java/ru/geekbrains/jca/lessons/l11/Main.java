package ru.geekbrains.jca.lessons.l11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FruitBox<Apple> appleFruitBox = new FruitBox<>(new Apple(), new Apple(), new Apple());

        FruitBox<Orange> oranges = new FruitBox<>(new Orange(), new Orange());

        System.out.println(appleFruitBox.equalsByWeight(oranges));

        FruitBox<Orange> orangeFruitBox = new FruitBox<>(new Orange());

        System.out.println(oranges.getWeight());
        oranges.transferAll(orangeFruitBox);
        System.out.println(orangeFruitBox.getWeight());
        System.out.println(oranges.getWeight());


    }

    public static void replaceTwoElements(Object[] arr, int i1, int i2) {
        Object temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static <T> ArrayList<T> arrToList(T[] arr) {
        ArrayList<T> result = new ArrayList<T>(arr.length);
        for (T t : arr) {
            result.add(t);
        }
        return result;
    }

}
