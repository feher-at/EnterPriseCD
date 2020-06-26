public class Player {
    private Writer writer;
    private Cd cd;
    private PlayerMode playerMode;

    public Player(Writer writer, Cd cd, PlayerMode playerMode) {
        this.writer = writer;
        this.cd = cd;
        this.playerMode = playerMode;
    }

    public void next(){

    }
    public void prev(){

    }
    public void show(){

    }
    public void stop(){

    }
    public void start(){

    }
   public void setWriter(Writer writer){
        this.writer = writer;
   }
   public void setCd(Cd cd){
        this.cd = cd;
   }
   public void setMode(PlayerMode playerMode){
        this.playerMode = playerMode;
    }
}
