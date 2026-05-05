package functional_Interface;

public class ConsolePrinter implements Printable {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}