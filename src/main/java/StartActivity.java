public class StartActivity implements  Activity{

    Writer writer;

    public StartActivity(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void activate() {
        writer.write("The track started to play");
    }
}
