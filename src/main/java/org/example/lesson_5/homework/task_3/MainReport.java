package org.example.lesson_5.homework.task_3;

import org.example.lesson_5.homework.task_3.strategies.ExcelReportStrategy;
import org.example.lesson_5.homework.task_3.strategies.PdfReportStrategy;
import org.example.lesson_5.homework.task_3.strategies.ReportStrategy;
import org.example.lesson_5.homework.task_3.strategies.WordReportStrategy;

public class MainReport {

//    public class ReportGenerator {
//        public void generate(String type) {
//            if (type.equals("pdf")) {
//                System.out.println("Fetching data for PDF...");
//                System.out.println("Formatting data for PDF...");
//                System.out.println("Generating PDF report...");
//            } else if (type.equals("excel")) {
//                System.out.println("Fetching data for Excel...");
//                System.out.println("Formatting data for Excel...");
//                System.out.println("Generating Excel report...");
//            } else {
//                System.out.println("Unknown report type.");
//            }
//        }
//    }

    public static void main(String[] args) {
        ReportStrategy pdfReportStrategy = new PdfReportStrategy();
        ReportStrategy excelReportStrategy = new ExcelReportStrategy();
        ReportStrategy wordReportStrategy = new WordReportStrategy();

        pdfReportStrategy.report();
        excelReportStrategy.report();
        wordReportStrategy.report();
    }
}
