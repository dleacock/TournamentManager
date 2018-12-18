import java.io.*;

public class TournamentManager implements Serializable {
    private static final long serialVersionUID = 1L;

    private Tournament tournament;

    public TournamentManager(){

    }

    public void addTeam(Team newTeam){
        tournament.addTeam(newTeam);
    }

    public void scheduleMatch(Team team1, Team team2){
        tournament.scheduleMatch(team1, team2);
    }

    public void enterResults(int matchNumber, int finalScore, String winningTeam){
        tournament.enterResults(matchNumber, finalScore, winningTeam);

    }

    public String getTournamentName(){
        return tournament.getTournamentName();
    }

    public void printTournament(){
        tournament.printTournament();
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
