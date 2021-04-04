package com.company;

/**
 * Класс CharThread , реализует проверку символа и подсчет количества вхождений подстраки в строку , реализует интерфейс Runnable
 */
public class CharThread implements Runnable{

    private static final Object LOCK_1 = new Object();
    private static final Object LOCK_2 = new Object();

    private final String INPUT_STRING;
    private final String TEMPLATE;

    private static volatile int counter = 0;
    private static volatile int charIndex = 0;

    public CharThread(String INPUT_STRING , String TEMPLATE) {
       this.INPUT_STRING = INPUT_STRING;
       this.TEMPLATE = TEMPLATE;

    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CharThread.counter = counter;
    }

    /**
     * Реализация метода run , интерфейса Runnable
     */
    @Override
    public void run() {
        while (checkIndexOccurrence(charIndex)){

            int currentIndex;

            synchronized (LOCK_1){
                if(checkIndexOccurrence(charIndex)){
                    charIndex++;
                    currentIndex = charIndex;
                } else {
                    return;
                }
            }

            char c = INPUT_STRING.charAt(currentIndex);
            boolean check = Matcher.match(String.valueOf(c) , TEMPLATE);

            synchronized (LOCK_2){
                if(check){
                    counter++;
                }
            }

        }

    }

    /**
     * Метод проверки индекса символа на вхождение в границы длинны строки
     * @param charIndex индекс симнола
     * @return {@code true} индекс не выходит за границы длинны строки, иначе {@code false}
     */
    private boolean checkIndexOccurrence(int charIndex){
        return charIndex < INPUT_STRING.length() - 1;
    }
}
