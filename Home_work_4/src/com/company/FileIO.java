package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Класс для считывания входного файла
 */
public class FileIO {

    private String fileData;
    private String filePath;

    /**
     * поле хранящее регулярное выражение для поиска слова в строке
     */
    public static final String WORD_PATTERN = "[а-яА-Яa-zA-Z]+";

    public FileIO(String filePath){
        this.filePath = filePath;
        this.fileData = readFile(filePath);
    }

    /**
     * Приватный метод для чтения файла
     * @param filePath - путь до файла
     * @return строка содержащая данные из файла
     */
    private static String readFile(String filePath) {
        StringBuilder fileData = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {

            String readData;
            while ((readData = br.readLine()) != null) {
                fileData.append(readData).append("\n");
            }

        } catch (IOException e) {
            System.err.println("Файл не найден , неверный путь или файла не существует!  ");

        }
        return fileData.toString();
    }


    /**
     * Метод для подчсета кол-ва слов в строке
     * @param fileData - строка содержащая данные из файла
     * @return кол-во слов
     */
    public Integer countWords(String fileData){

        try {
            Pattern pattern = Pattern.compile(WORD_PATTERN);
            Matcher matcher = pattern.matcher(fileData);

            int count = 0;
            while (matcher.find()){
                count++;
            }

            return count;
        }catch (PatternSyntaxException e){
            System.err.println("Pattern encoding error");
        }
        return null;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
