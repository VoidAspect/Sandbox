package com.alevel.sandbox.generics;

public class IntSumAggregator extends SumAggregator<Integer> {
    @Override
    Integer sum(Integer x, Integer y) {
        return x != null ? (y != null ? x + y : x) : y;
    }
}
