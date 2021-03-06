package com.alevel.sandbox.oop;

public final class Cat extends Pet implements Cute {

    @Override
    public void say() {
        System.out.println("Meow!");
    }

    @Override
    public int howCute() {
        return Integer.MAX_VALUE;
    }
}
