public class AudioCd extends Cd {

    public AudioCd(String Name)  {
        this.name = Name;
    }

    @Override
    void addTracks(Song song) {
        songs.add(song);
    }
}
