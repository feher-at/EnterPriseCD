public class Main {

    public static void main(String[] args) {


        Menu menu = new Menu();
        Writer writer = new ConsoleWriter();
        MenuItem cdPlayer = new MenuItem("Cd player", new CdActivity(writer));
        menu.addItem(cdPlayer);
       
        Cd cd = new Mp3Cd("Hello World");
        for (int i = 0; i < 10; i++) {
            Song song = new AudioSong(i);
            cd.addTracks(song);
        }
        Player player = new Player(writer,cd,PlayerMode.CD);

    }
}
