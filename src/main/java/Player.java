public class Player {
    private Writer writer;
    private Cd cd;
    private PlayerMode playerMode;
    private Activity activity;
    private int whichTrack = 0;

    public Player(Writer writer, Cd cd, PlayerMode playerMode) {
        this.writer = writer;
        this.cd = cd;
        this.playerMode = playerMode;
    }

    public void next(){
        activity = new NextActivity(writer);
        activity.activate();
        whichTrack += 1;
    }
    public void prev(){
        activity = new PrevActivity(writer);
        activity.activate();
        whichTrack -= 1;
    }
    public void showPlayerMenu(){
        activity = new ShowActivity();
        activity.activate();
    }
    public void stop(){
        activity = new StopActivity(writer);
        activity.activate();
    }
    public void start(){
        activity = new StartActivity(writer);
        activity.activate();
    }
    public void ShowInformation(){
        writer.write(cd.name);
        writer.write(cd.songs.get(whichTrack % cd.songs.size()).Title);

    }

   public void setWriter(Writer writer){
        this.writer = writer;
   }
   public void setCd(Cd cd){
        if(playerMode == PlayerMode.CD) {
            if (cd.getClass() == Mp3Cd.class) {
                this.cd = cd;
            }
        }
        else if(playerMode == PlayerMode.SPOTIFY){
            if (cd.getClass() == AudioCd.class) {
                this.cd = cd;
            }
        }
   }
   public void setMode(PlayerMode playerMode){
        this.playerMode = playerMode;
    }
}
