public class NextActivity implements Activity{

    private Writer writer;


    public NextActivity(Writer writer) {
        this.writer = writer;

    }
    @Override
    public void activate() {
        writer.write("Next track is coming");
    }
}
