import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Main {





    public static PlayerMode choosePlayer(Writer writer){
        Scanner getPlayerModeFromUser = new Scanner(System.in);
        System.out.print("Choose from the above menu: ");
        String getPlayerMode = getPlayerModeFromUser.nextLine();
        getPlayerMode.toLowerCase();
        if(getPlayerMode.equals("cd") || getPlayerMode.equals("cd player")){
            writer.write("You chose the CD mode");
            return PlayerMode.CD;}
        else if(getPlayerMode.equals("spotify") || getPlayerMode.equals("spotify player")){
            writer.write("You chose the Spotify mode");
            return PlayerMode.SPOTIFY;}
        else if(getPlayerMode.equals("exit")){
            writer.write("Have a good day!");
            return PlayerMode.EXIT;}

        else{
            System.out.println("Invalid input");
            return null;
        }
    }
    public static Cd ChooseCd(List<Cd> cdList,Writer writer){

        for(Cd cd: cdList){
            System.out.println(cd.name + "\n");
        }
        Scanner getCdTitleFromUser = new Scanner(System.in);
        System.out.print("Choose the Cd : ");
        String getTitle = getCdTitleFromUser.nextLine();
        getTitle.toLowerCase();
        for(Cd cd: cdList){
            if(cd.name.toLowerCase().equals(getTitle)){
                writer.write("You chose the " + getTitle + " CD");
                return cd;
            }
        }
        writer.write("There is no such a Cd " + getTitle);
        return null;


    }




    public static void main(String[] args) {
        Cd mp3Cd = new Mp3Cd("test");
        mp3Cd.addTracks(new Mp3Song(200,"LakatosHuaníta: iron"));
        mp3Cd.addTracks(new Mp3Song(400,"KissRonaldo: Diik"));
        mp3Cd.addTracks(new Mp3Song(300,"Lakatos Nine: copper"));
        mp3Cd.addTracks(new Mp3Song(100,"májküljeckson: billijíns"));
        List<Cd> CdList = new ArrayList<Cd>();
        CdList.add(mp3Cd);

        Writer writer = new ConsoleWriter();
        Menu menu = new Menu();
        MenuItem cdPlayer = new MenuItem("Cd player", new CdActivity(writer));
        menu.addItem(cdPlayer);
        MenuItem spotifyPlayer = new MenuItem("Spotify player", new SpotifyActivity(writer));
        menu.addItem(spotifyPlayer);
        boolean wantToExit = false;
        while(true) {
            PlayerMode playerMode = null;
            Cd chosenCd = null;

            while(playerMode == null ) {
                menu.show();
                playerMode = choosePlayer(writer);

                if (playerMode == PlayerMode.CD) {
                    chosenCd = ChooseCd(CdList, writer);
                } else if (playerMode == PlayerMode.SPOTIFY) {
                    writer.write("there will be an audio Cd list");


                } else if (playerMode == PlayerMode.EXIT) {

                    break;


                }
            }
            if(wantToExit){break;}
            Player player = new Player(writer, chosenCd, playerMode);
            player.start();

            while (true) {
                player.showInformation();
                player.showPlayerMenu();
                Scanner getChosenMenuFromUser = new Scanner(System.in);
                System.out.print("Choose the menu : ");
                String chosenMenu = getChosenMenuFromUser.nextLine().toLowerCase();
                if (chosenMenu.equals("next")) {
                    player.next();

                } else if (chosenMenu.equals("prev")) {
                    player.prev();

                } else if (chosenMenu.equals("stop")) {
                    player.stop();

                } else if (chosenMenu.equals("start")) {
                    player.start();

                } else if (chosenMenu.equals("exit")) {

                    break;
                } else {
                    System.out.println("This is an invalid input");
                }
            }
        }



    }
}
