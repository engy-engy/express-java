package org.example.lesson_5.homework.task_5.strategies;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileSaveStrategy implements FileSaveStrategy<String> {
    @Override
    public void saveFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
        System.out.println("Saved text content to file, filename: " + fileName);
    }
}
