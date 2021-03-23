package com.company;

/**
 * Home_work 4
 * @author Kolosov Slava
 * @version 1
 */
public class Main {

    public static void main(String[] args) {

        try {
            FileIO fileIO = new FileIO(args[0]);

            System.out.println(fileIO.getFileData());

            System.out.println(fileIO.countWords(fileIO.getFileData()));

        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Ошибка, не задан путь до файла! Передайте путь до входного файла в аргументах командной строки!");
        }

    }
}
