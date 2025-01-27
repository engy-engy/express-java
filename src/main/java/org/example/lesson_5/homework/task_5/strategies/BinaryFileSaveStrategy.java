package org.example.lesson_5.homework.task_5.strategies;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileSaveStrategy implements FileSaveStrategy<byte[]> {
    @Override
    public void saveFile(String fileName, byte[] content) throws IOException {
        FileOutputStream stream = new FileOutputStream(fileName);
        stream.write(content);
        stream.close();
        System.out.println("Saved binary content to file, filename: " + fileName);
    }
}
