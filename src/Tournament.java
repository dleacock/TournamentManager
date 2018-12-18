import java.io.*;
import java.util.*;

public class Tournament implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Team> teams = new ArrayList<>();
    private Map<Integer, Match> matches = new HashMap<>();
    private int numberOfMatches;
    private String tournamentName;

    public Tournament(String tournamentName) {
        numberOfMatches = 0;
        this.tournamentName = tournamentName;
    }

    public Team getTeam(String teamName) {
        for(Team team : teams){
            if (team.getTeamName().equals(teamName)){
                return team;
            }
        }
        System.out.println("Team: " + teamName + " not found.");
        return null;
    }

    public void printTeams(){
        System.out.println(teams.toString());
    }

    protected void addTeam(Team team) {
        if (!teams.contains(team)) {
            teams.add(team);
        } else {
            System.out.println("Team: " + team.getTeamName() + " already in tournament");
        }
    }

    public void enterResults(int matchNumber, int finalScore, String winningTeam) {
        matches.get(matchNumber).setFinalScore(finalScore, winningTeam);
    }

    public void scheduleMatch(Team team1, Team team2) {
        matches.put(++numberOfMatches, new Match(team1, team2));
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void printTournament() {
        System.out.println("*****************");
        System.out.println("TOURNAMENT");
        System.out.println(matches);

    }


}
