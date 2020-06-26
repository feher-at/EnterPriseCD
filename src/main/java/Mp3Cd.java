public class Mp3Cd extends Cd{


    public Mp3Cd(String Name) {
        this.name = Name;
    }

    @Override
    void addTracks(Song song) {
        songs.add(song);
    }
}
