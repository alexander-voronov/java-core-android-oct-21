package ru.geekbrains.jca.lessons.l5;

public class Main {
    public static void main(String[] args) {

        Person[] persArray = new Person[4];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312311", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Assistant", "petrov@mailbox.com", "892312312", 25000, 25);
        persArray[2] = new Person("Pushkin Alexander", "Boss", "pushkin@mailbox.com", "892312313", 50000, 50);
        persArray[3] = new Person("Sidorov Sidr", "Accountant", "sidorov@mailbox.com", "892312314", 40000, 45);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].print();
            }
        }
    }
}
