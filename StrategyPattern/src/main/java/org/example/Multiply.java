package org.example;

public class Multiply implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }
}
