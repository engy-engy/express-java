package org.example.lesson_5.homework.task_3;

import org.example.lesson_5.homework.task_3.strategies.ExcelReportStrategy;
import org.example.lesson_5.homework.task_3.strategies.PdfReportStrategy;
import org.example.lesson_5.homework.task_3.strategies.ReportStrategy;
import org.example.lesson_5.homework.task_3.strategies.WordReportStrategy;

public class ReportStrategyHandler {
    public static ReportStrategy getStrategy(ReportType reportType) {
        return switch (reportType) {
            case PDF -> new PdfReportStrategy();
            case EXCEL -> new ExcelReportStrategy();
            case WORD -> new WordReportStrategy();
            default -> throw new IllegalArgumentException("Unknown report type");
        };
    }
}
