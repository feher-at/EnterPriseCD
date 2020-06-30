public class PrevActivity implements Activity {

    private Writer writer;

    public PrevActivity(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void activate() {
        writer.write("previous track is coming");
    }
}
