public class Mp3Song extends Song {

    int Size;


    public Mp3Song(int size,String title) {
        Title = title;
        Size = size;

    }

    @Override
    public int getLenght() {
        return 0;
    }

    public int getSize() {
        return Size;
    }
}
