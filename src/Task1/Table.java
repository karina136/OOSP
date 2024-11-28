package Task1;

public class Table implements ReportFactory {
    @Override
    public void generate() {
        System.out.println("Сгенерирован отчет в виде таблицы.");

    }
}
