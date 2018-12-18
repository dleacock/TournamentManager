import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Team implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Player> players = new ArrayList<>();
    private String teamName;
    private Coach coach;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addCoach(Coach coach) {
        if (this.coach != null) {
            System.out.println("Replacing Coach");
        }
        this.coach = coach;
    }

    public void addPlayer(Player newPlayer) {
        if (!players.contains(newPlayer)) {
            players.add(newPlayer);
        } else {
            System.out.println(newPlayer + " already plays on " + teamName);
        }
    }

    public String getTeamName(){
        return "Team: " + teamName;
    }

    public String toString() {
        return "Team: " + teamName + "\n"
                + "Coach: " + coach + "\n"
                + "Players: " + "\n" + players;
    }

}
