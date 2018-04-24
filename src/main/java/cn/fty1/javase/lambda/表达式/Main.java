package cn.fty1.javase.lambda.表达式;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public class Main {


    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("runnable");
        runnable.run();


        ActionListener actionListener = event -> System.out.println("action");


        Runnable multiStatement = () -> {
            System.out.print("multiStatement");
            System.out.println("multiStatement.");
        };
        multiStatement.run();

        BinaryOperator<Long> binaryOperator = (x,y) -> x+y;
        Long res = binaryOperator.apply(2L, 3L);
        System.out.println(res);


        BinaryOperator<Long> longBinaryOperator = (Long x,Long y) -> x+y;
        res = longBinaryOperator.apply(2L, 3L);
        System.out.println(res);



    }
}
