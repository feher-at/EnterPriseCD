import java.util.ArrayList;

abstract class Cd {
    private int limit;
    private ArrayList<Song> songs;


    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public Cd(int limit, ArrayList<Song> songs) {
        this.limit = limit;
        this.songs = songs;
    }


}
