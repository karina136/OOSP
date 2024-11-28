package Task1;

public abstract class Reports {
    public void doReport() {
        ReportFactory reportFactory = createReport();
        reportFactory.generate();
    }
    public abstract ReportFactory createReport();
}
