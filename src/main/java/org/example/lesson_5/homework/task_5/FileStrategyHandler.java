package org.example.lesson_5.homework.task_5;

import org.example.lesson_5.homework.task_5.strategies.BinaryFileSaveStrategy;
import org.example.lesson_5.homework.task_5.strategies.FileSaveStrategy;
import org.example.lesson_5.homework.task_5.strategies.FileType;
import org.example.lesson_5.homework.task_5.strategies.TextFileSaveStrategy;

public class FileStrategyHandler<T> {
    public FileSaveStrategy<T> getStrategy(FileType fileType) {
        return switch (fileType) {
            case TEXT -> (FileSaveStrategy<T>) new TextFileSaveStrategy();
            case BINARY -> (FileSaveStrategy<T>) new BinaryFileSaveStrategy();
            default -> throw new IllegalArgumentException("Unknown file type");
        };
    }
}
