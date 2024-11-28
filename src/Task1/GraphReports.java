package Task1;

public class GraphReports extends Reports{
    @Override
    public ReportFactory createReport() {
        return new Graph();
    }
}
