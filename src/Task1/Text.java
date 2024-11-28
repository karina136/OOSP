package Task1;

import java.sql.SQLOutput;

public class Text implements ReportFactory {
    @Override
    public void generate() {
        System.out.println("Сгенерирован текстовый отчет.");

    }
}
