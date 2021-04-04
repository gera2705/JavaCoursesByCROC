package com.company;

import java.util.ArrayList;

/**
 * HW 5
 * @author Kolosov Slava
 * @version 1
 */
public class Main {

    /**
     * Пример входной строки.
     */
    public static final String INPUT_STRING = "Невежество есть мать промышленности, как и суеверий." +
            " Сила размышления и воображения подвержена ошибкам; но привычка двигать рукой или ногой" +
            " не зависит ни от того, ни от другого. Поэтому мануфактуры лучше всего процветают там, где" +
            " наиболее подавлена духовная жизнь, так что мастерская может рассматриваться как машина," +
            " части которой составляют люди.";

    /**
     * Шаблон поиска символов в строке.
     */
    public static final String TEMPLATE = " ";

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки.
     */

    public static void main(String[] args) {

        long current = System.currentTimeMillis();

        ArrayList<Thread> threads = new ArrayList<>();

        //Методом научного тыка было подобрано оптимальное по времени кол-во потоков (на моем железе время = 0.145 с.)
        int numberOfThreads = 600;

        for (int i = 0; i < numberOfThreads; i++) {
            threads.add(new Thread(new CharThread(INPUT_STRING , TEMPLATE)));
            threads.get(i).start();
        }

        try{

            for (Thread thread:threads) {
                thread.join();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Кол-во найденых символов: " + CharThread.getCounter());

        System.out.println("Время: " + (System.currentTimeMillis() - current)/1000.0  + " с.");

    }
}
