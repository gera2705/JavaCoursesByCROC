package com.company;

/**
 * HW_6
 * @author Kolosov Slava
 * @version 1
 */
public class Main {

    public static void main(String[] args) {

        String str = "КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";

        System.out.println(PathSpotter.getNormalizingPath(str));
    }

}

