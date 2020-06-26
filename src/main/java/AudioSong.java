public class AudioSong extends Song {
    private float samplingFrequency;

    public float getSamplingFrequency() {
        return samplingFrequency;
    }

    public AudioSong(float samplingFrequency) {
        this.samplingFrequency = samplingFrequency;
    }

    @Override
    public int getLenght() {
        return 0;
    }
}
