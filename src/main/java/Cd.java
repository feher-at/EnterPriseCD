import java.util.ArrayList;

abstract class Cd {
    protected int limit;
    protected ArrayList<Song> songs;
    protected String name;


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public ArrayList<Song> getTracks() {
        return songs;
    }
    abstract void addTracks(Song song);



}
