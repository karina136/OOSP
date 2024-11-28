package Task1;

import java.util.Scanner;

public class GenerateReportsApp {
    public static Reports report;
    public static void doReports() {
        report.doReport();
    }
    private static void configureReportsType(String type) {
        switch (type) {
            case "текст":
                report = new TextReports();
            case "граф":
                report = new GraphReports();
            case  "таблица":
                report = new TableReports();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        configureReportsType(type);
        doReports();
    }
}
