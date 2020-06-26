public class Main {

    public static void main(String[] args) {

        Writer writer = new ConsoleWriter();
        Cd cd = new Mp3Cd("Hello World");
        for (int i = 0; i < 10; i++) {
            Song song = new AudioSong(i);
            cd.addTracks(song);
        }
        Player player = new Player(writer,cd,PlayerMode.CD);

    }
}
