package com.zyg.behavioral.strategy;

public class AddStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
