package org.example;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new Addition());
        int res = context.executeStrategy(10,20);
        context.setStrategy(new Multiply());
        int res2 = context.executeStrategy(10,10);
        System.out.println(res+","+res2);

    }
}