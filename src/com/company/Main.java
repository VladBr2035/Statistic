package com.company;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\1.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;

        // Инициализация счетчиков

        int countWord = 0;
        int characterCount = 0;
        int whitespaceCount = 0;

        // Чтение построчно из
        // файл, пока ноль не будет возвращен

        while((line = reader.readLine()) != null) {

            if(!(line.equals(""))) {

                characterCount += line.length();

                // // s + это разделитель пространства в java

                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
                whitespaceCount += countWord -1;
                

            }

        }

        System.out.println("Слов = " + countWord);
        System.out.println("Символов = " + characterCount);
        System.out.println("Пробелы = " + whitespaceCount);

    }

}