package org.example.lesson_5.homework.task_5;

import org.example.lesson_5.homework.task_5.strategies.BinaryFileSaveStrategy;
import org.example.lesson_5.homework.task_5.strategies.FileSaveStrategy;
import org.example.lesson_5.homework.task_5.strategies.TextFileSaveStrategy;

import java.io.IOException;

public class Main {

//    public class FileHandler {
//        public void saveTextFile(String fileName, String content) throws IOException {
//            FileWriter writer = new FileWriter(fileName);
//            writer.write(content);
//            writer.close();
//        }
//
//        public void saveBinaryFile(String fileName, byte[] data) throws IOException {
//            FileOutputStream stream = new FileOutputStream(fileName);
//            stream.write(data);
//            stream.close();
//        }
//    }


    public static void main(String[] args) {
        FileSaveStrategy<String> textFileStrategy = new TextFileSaveStrategy();
        FileSaveStrategy<byte[]> binaryFileStrategy = new BinaryFileSaveStrategy();
        byte[] bytes = {1,0,1,0,1,0};

        try {
            textFileStrategy.saveFile("_text_file", "_text_content");
            binaryFileStrategy.saveFile("_binary_file", bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
