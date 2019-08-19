package com.alevel.sandbox.generics;

final class Cat {
    private final String name;
    private int age;
    private boolean alive;

    Cat(String name) {
        this.name = name;
        age = 0;
        alive = true;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void kill() {
        alive = false;
    }

    boolean isAlive() {
        return alive;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
