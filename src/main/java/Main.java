public class Main {

    public static void main(String[] args) {
        Cd mp3Cd = new Mp3Cd("test");
        Writer writer = new ConsoleWriter();

        //Menu menu = new Menu();

        //Player CdPlayer = new Player();
        MenuItem cdPlayer = new MenuItem("Cd player", new CdActivity(writer));
        //menu.addItem(cdPlayer);
        MenuItem spotifyPlayer = new MenuItem("Spotify player", new SpotifyActivity(writer));
        //menu.addItem(spotifyPlayer);
       

        //menu.show();



    }
}
