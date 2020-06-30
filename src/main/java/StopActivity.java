public class StopActivity implements Activity {

    Writer writer;

    public StopActivity(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void activate() {

        writer.write("The track is stopped");
    }
}
