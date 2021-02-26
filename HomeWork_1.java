package com.company;

public class HomeWork_1 {

    /**
     * Homework number one for CROC courses
     * @version 1
     * @author Kolosov Slava
     */

    private static final String RESULT_1 = "Fizz";
    private static final String RESULT_2 = "Buzz";

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            System.out.println(checkMultiplicity(i));
        }

    }


    /**
     * Метод проверки числа на кратность 3 и/или 5
     * @param number - проверяемое число
     * @return - строка с результатом
     */

    public static String checkMultiplicity(int number){

        if(number % 3 == 0 && number % 5 == 0) {
            return RESULT_1 + RESULT_2;
        }else if(number % 3 == 0){
            return RESULT_1;
        }else if(number % 5 == 0){
            return RESULT_2;
        }else return String.valueOf(number);

    }
}
