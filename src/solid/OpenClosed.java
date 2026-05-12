package solid;

public class OpenClosed {

//    пример плохого кода

    double tax(String type, double sum) {
        if (type.equals("6")) return sum * 0.06;
        if (type.equals("15")) return sum * 0.15;
        return 0;
    }

//    много ветвлияний, if и.т.д
}

// пример хорошего кода

interface TaxStrategy { double calc(double sum); }

class Tax6 implements TaxStrategy {
    public double calc(double sum) {
        return sum * 0.06;
    }
}

class Tax15 implements TaxStrategy {
    public double calc(double sum) {
        return sum * 0.15;
    }
}

// появилась структура, мы убрали лишние ветвлияния и.т.д