package Task1;

public class TextReports extends Reports{
    @Override
    public ReportFactory createReport() {
        return new Text();
    }
}
