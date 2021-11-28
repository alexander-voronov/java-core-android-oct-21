package ru.geekbrains.jca.lessons.l10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "12345");
        phonebook.add("Petrov", "910123456");
        phonebook.add("Sidorov", "905123456");
        phonebook.add("Puskin", "926123456");
        phonebook.add("Ivanov", "123456789");


        System.out.println("phone Ivanov: " + phonebook.get("Ivanov"));
        System.out.println("phone Petrov: " + phonebook.get("Petrov"));
    }

    private static final String words =

            "To be" +
                    "or not to be" +
                    "that is the question" +
                    "or not to be" +
                    "or not to be to be to be";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.merge(s, 1, Integer::sum);
        }
        return map;
    }
}
