import java.io.*;

public class TournamentManager implements Serializable {

    private Tournament tournament;

    public TournamentManager(){

    }

    public void createTournament(String tournamentName){
        tournament = new Tournament(tournamentName);
    }

    public void setTournament(Tournament tournament){
        this.tournament = tournament;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void writeOut(){

        try {
            String outputFileName = getTournament().getTournamentName() + ".out";
            File outputFile = new File(outputFileName);
            outputFile.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile, false));
            oos.writeObject(this);
            oos.close();
        } catch (IOException e){
            System.out.println(e);
        }

    }

    public void readFile(String fileName){
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            TournamentManager t = (TournamentManager) in.readObject();
            setTournament(t.getTournament());
            System.out.println("Loading Tournament");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }


}
