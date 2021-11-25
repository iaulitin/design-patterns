package ru.iaulitin.patterns.creational.builder;

public class Demo {

    public static void main(String[] args) {
        Cat cat = new Cat.Builder()
                .name("Tom")
                .age(10)
                .color(Color.GREY)
                .build();

    }
}
