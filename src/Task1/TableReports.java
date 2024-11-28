package Task1;

public class TableReports extends Reports{
    @Override
    public ReportFactory createReport() {
        return new Text();
    }
}
