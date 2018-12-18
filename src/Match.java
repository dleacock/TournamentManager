import java.io.Serializable;

public class Match implements Serializable {
    private static final long serialVersionUID = 1L;

    private Team team1;
    private Team team2;
    private String winner;
    private boolean matchComplete;
    private int finalScore;

    public Match(Team team1, Team team2) {
        this.finalScore = -1;
        this.winner = "";

        this.team1 = team1;
        this.team2 = team2;
    }

    public void setFinalScore(int finalScore, String winningTeam) {
        this.finalScore = finalScore;
        this.winner = winningTeam;
        matchComplete = true;
    }

    public String getResults() {
        if (matchComplete) {
            return "Winner: " + winner + " Final Score: " + finalScore;
        } else {
            return "Match Underway";
        }

    }

    public String toString() {
        return team1.getTeamName() + " vs " + team2.getTeamName() + "\n"
                + this.getResults();
    }

}
