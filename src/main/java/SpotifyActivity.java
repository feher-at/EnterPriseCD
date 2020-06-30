public class SpotifyActivity implements Activity {

    private Writer writer;

    public SpotifyActivity(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void activate() {
        writer.write("You chose the spotify player");
    }
}
