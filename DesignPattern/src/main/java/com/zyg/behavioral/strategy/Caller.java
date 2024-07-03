package com.zyg.behavioral.strategy;

public class Caller {

    private static String strategyType = "multiply";

    private static Strategy strategy;

    public static void main(String[] args) {
        if("add".equals(strategyType)) {
            strategy = new AddStrategy();
        } else if ("subtract".equals(strategyType)) {
            strategy = new SubtractStrategy();
        } else if ("multiply".equals(strategyType)) {
            strategy = new MultiplyStrategy();
        }

        int result = strategy.execute(10, 10);
        System.out.println(result);
    }
}
