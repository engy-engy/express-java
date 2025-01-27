package org.example.lesson_5.homework.task_5.strategies;

import java.io.IOException;

public interface FileSaveStrategy<T> {
    void saveFile(String fileName, T content) throws IOException;
}
