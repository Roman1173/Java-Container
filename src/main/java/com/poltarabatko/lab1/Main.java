package com.poltarabatko.lab1;
public class Main {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>();

        container.add(1);
        container.add(2);
        container.add(3);

        System.out.println("Размер контейнера: " + container.size());

        System.out.println("Элемент с индексом 0: " + container.get(0));
        System.out.println("Элемент с индексом 1: " + container.get(1));
        System.out.println("Элемент с индексом 2: " + container.get(2));

        container.remove(1);

        System.out.println("Обновленный размер контейнера: " + container.size());

    }
}