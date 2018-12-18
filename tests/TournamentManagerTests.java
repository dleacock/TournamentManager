import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class TournamentManagerTests {

    TournamentManager tournamentManager = new TournamentManager();
    Team team1;
    Team team2;
    Team team3;
    Team team4;
    Tournament tournament;

    public TournamentManagerTests() {

        team1 = new Team("Lighting");
        team1.addCoach(
                new Coach("Don", "Coachman", 2, "coachman@yahoo.ca"));
        team1.addPlayer(new Player("Taylor", "Dooley", 24, "Center"));
        team1.addPlayer(new Player("Sarah", "Cooley", 58, "Right"));
        team1.addPlayer(new Player("Gloria", "Zooley", 54, "Left"));
        team1.addPlayer(new Player("David", "Wooley", 23, "Forward"));

        team2 = new Team("Thunders");
        team2.addCoach(
                new Coach("Chris", "Sports", 1, "chris@altavista.com"));
        team2.addPlayer(new Player("Roger", "Zario", 14, "Center"));
        team2.addPlayer(new Player("Mary", "Tario", 48, "Right"));
        team2.addPlayer(new Player("Mario", "Ontario", 34, "Left"));
        team2.addPlayer(new Player("Wario", "Bario", 76, "Forward"));

        team3 = new Team("Blizzards");
        team3.addCoach(
                new Coach("Nancy", "Snowlady", 5, "snowlady@webcrawler.com"));
        team3.addPlayer(new Player("Tim", "Timmers", 24, "Center"));
        team3.addPlayer(new Player("Scott", "Scotters", 46, "Right"));
        team3.addPlayer(new Player("Kate", "Katey", 31, "Left"));
        team3.addPlayer(new Player("Kyle", "Kyleton", 36, "Forward"));

        team4 = new Team("Breeze");
        team4.addCoach(
                new Coach("Amber", "Rock", 5, "amberrocks@netscape.com"));
        team4.addPlayer(new Player("Lyle", "McDonald", 14, "Center"));
        team4.addPlayer(new Player("Ben", "Harveys", 16, "Right"));
        team4.addPlayer(new Player("Chris", "Subway", 11, "Left"));
        team4.addPlayer(new Player("Taylor", "Fiveguys", 16, "Forward"));

        tournament = new Tournament("AllStars");
        tournamentManager.setTournament(tournament);
    }

    @Test
    public void addTwoTeamsSaveResults() {

        System.out.println("***** NEW TOURNAMENT ADDING TWO TEAMS AND RESULTS ****");

        tournamentManager.getTournament().addTeam(team1);
        tournamentManager.getTournament().addTeam(team2);

        tournamentManager.getTournament().scheduleMatch(team1, team2);
        tournamentManager.getTournament().enterResults(1, 6, team1.getTeamName());

        tournamentManager.writeOut();

        File savedFile = new File(tournamentManager.getTournament().getTournamentName() + ".out");
        Assert.assertTrue(savedFile.isFile());

        tournamentManager.getTournament().printTournament();
        System.out.println("***************************************");
    }

    @Test
    public void testLoadingTournament() {
        System.out.println("***** LOADING OLD TOURNAMENT AND PRINT RESULTS ****");
        tournamentManager.readFile("Test.out");
        tournamentManager.getTournament().printTournament();
        System.out.println("***************************************");
    }


}
