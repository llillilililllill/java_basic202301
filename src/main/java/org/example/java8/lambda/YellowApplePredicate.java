package org.example.java8.lambda;

import static org.example.java8.lambda.Color.YELLOW;

public class YellowApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor() == YELLOW;
    }
}
