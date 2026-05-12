package solid;

public class SingleResponsibility {
//    пример плохого кода

    String text;
    void print() {}
    void saveToFile() {}
}
//    пример хорошего кода

class Report { String text; }

class ReportPrinter {
    void print (Report r) {}
}

class ReportSaver {
    void save(Report r) {}
}