package com.alevel.sandbox.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparisonDemo {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(-100);
        ints.add(29);
        ints.add(0);

        ints.sort(Comparator.reverseOrder());
        System.out.println(ints);

    }
}
