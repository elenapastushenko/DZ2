package com.test;

public class Person {

    public static void main(String[] main) {
        Person person = new Person("Evgeniy", 18);
        System.out.println(person.toString());
    }

    private String name;
    private Integer age;

    public Person() {
        this(null, null);
    }

    public Person(String name) {
        this(name, null);
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
