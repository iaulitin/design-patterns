package ru.iaulitin.patterns.creational.builder;

public class Cat {
    private String name;
    private int age;
    private Color color;

    public static class Builder {
        private String name;
        private int age;
        private Color color;

        public Cat.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Cat.Builder age(int age) {
            this.age = age;
            return this;
        }

        public Cat.Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Cat build() {
            Cat cat = new Cat();
            cat.name = this.name;
            cat.age = this.age;
            cat.color = this.color;
            return cat;
        }
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                '}';
    }
}
