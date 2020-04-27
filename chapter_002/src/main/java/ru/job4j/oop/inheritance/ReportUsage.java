package ru.job4j.oop.inheritance;

import ru.job4j.oop.inheritance.HtmlReport;
import ru.job4j.oop.inheritance.JSONReport;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        JSONReport jsonReport = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        String textJSON = jsonReport.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println(textJSON);
    }
}
