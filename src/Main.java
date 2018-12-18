public class Main {

    public static void main(String[] args) {

        Team team = new Team("Lighting");
        team.addCoach(
                new Coach("Don", "Coachman", 2, "coachman@yahoo.ca"));
        team.addPlayer(new Player("Taylor", "Dooley", 24, "Center"));
        team.addPlayer(new Player("Sarah", "Cooley", 58, "Right"));
        team.addPlayer(new Player("Gloria", "Zooley", 54, "Left"));
        team.addPlayer(new Player("David", "Wooley", 23, "Forward"));

        Team team1 = new Team("Thunders");
        team1.addCoach(
                new Coach("Chris", "Sports", 2, "coan@yahoo.ca"));
        team1.addPlayer(new Player("Roger", "Zario", 24, "Center"));
        team1.addPlayer(new Player("Strone", "Tario", 58, "Right"));
        team1.addPlayer(new Player("Mario", "Ontario", 54, "Left"));
        team1.addPlayer(new Player("Wario", "Bario", 23, "Forward"));

        Tournament tournament = new Tournament("T1");
        TournamentManager tm = new TournamentManager();


     /*   tm.setTournament(tournament);
        tm.getTournament().addTeam(team);
        tm.getTournament().addTeam(team1);

        tm.getTournament().scheduleMatch(team, team1);

        tm.getTournament().printTournament();

        tm.getTournament().enterResults(1, 23, team1.getTeamName());
        tm.getTournament().printTournament();

        tm.writeOut();*/

         tm.readFile("T1.out");




        //tournament.readFile("dump.out");

       /* tournament.addTeam(team);
        tournament.addTeam(team1);

        tournament.scheduleMatch(team, team1);

        tournament.printTournament();

        tournament.enterResults(1, 23, team1.getTeamName());
        tournament.printTournament();

        tournament.writeOut();*/




    }
}
