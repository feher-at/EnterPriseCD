public class CdActivity implements Activity {

    private Writer writer;

    public CdActivity(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void activate() {
        writer.write("You chose CD Player");
    }
}
