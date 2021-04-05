package com.company;

import java.util.Stack;

/**
 * Класс PathSpotter - класс для нормализации относительного пути
 */
public class PathSpotter {

    public static final String TEMPLATE = "/";
    public static final String STAY_PUT = ".";
    public static final String BACK = "..";

    /**
     * pathNormalizing - метод для нормализации пути
     * @param path - относительный путь
     * @return - стек хранящий в себе команды
     */
    private static Stack<String> pathNormalizing(String path){

        Stack<String> newPath = new Stack<>();
        String[]commands = path.split(TEMPLATE);

        for (String command : commands) {
            switch (command) {
                case STAY_PUT:
                    if (newPath.empty()) {
                        newPath.push(command);
                    }
                    break;
                case BACK:
                    if (!newPath.empty() && !newPath.peek().equals(BACK)) {
                        if (!newPath.empty() && newPath.peek().equals(STAY_PUT)) {
                            newPath.pop();
                        } else {
                            newPath.pop();
                            if (!newPath.empty() && newPath.peek().equals(STAY_PUT)) {
                                newPath.pop();
                            }
                            break;
                        }
                    }
                default:
                    newPath.push(command);
            }
        }
        return newPath;
    }

    /**
     * getNormalizingPath
     * @param path - относительный путь
     * @return String хранящая в себе нормализованый путь
     */
    public static String getNormalizingPath(String path){

        Stack<String> newPath = pathNormalizing(path);

        StringBuilder normalizedPath = new StringBuilder();

        for (String str: newPath) {
            normalizedPath.append(str).append(TEMPLATE);
        }

        return normalizedPath.substring(0 , normalizedPath.toString().length() - 1);

    }


}
