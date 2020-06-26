public class ConsoleWriter extends Writer {
    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
