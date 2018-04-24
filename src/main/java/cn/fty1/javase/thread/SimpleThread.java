package cn.fty1.javase.thread;

import java.util.concurrent.ThreadFactory;

public class SimpleThread {

    int i = 10;

    public static void main(String[] args) {

        SimpleThread simpleThread = new SimpleThread();
        for(int i = 0; i < 3000;i++){
           Runnable runnable = () -> {
                System.out.println(String.format("i:p{%s},r{%s}",1,simpleThread.getNextId()));
            };

            Runnable runnable2 = () -> {
                System.out.println(String.format("i:p{%s},r{%s}",1,simpleThread.getNextId()));
            };
            runnable.run();
            runnable2.run();
        }

    }


    public int getNextId(){
        return i--;
    }


}
