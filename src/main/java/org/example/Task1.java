//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Object, Object> phoneMap = new HashMap<>();
        phoneMap.put("+7(988)0097012", "Ivanov");
        phoneMap.put("+7(919)7924248", "Petrov");
        phoneMap.put("+7(988)0097022", "Belov");
        phoneMap.put("+7(919)7925258", "Musin");
        phoneMap.put("+7(111)7852449", "Krutova");
        phoneMap.put("+7(222)7844369", "Ezhov");
        phoneMap.put("+7(333)7858889", "Chernov");
        phoneMap.put("+7(444)7877369", "Savin");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию для поиска в базе");
        Object name;
        name = scanner.next();

        for(HashMap.Entry<Object, Object> phoneMapEntry : phoneMap.entrySet()) {
            if (phoneMapEntry.getValue().equals(name)) {
                System.out.println(phoneMapEntry.getKey());
            }
        }

    }
}