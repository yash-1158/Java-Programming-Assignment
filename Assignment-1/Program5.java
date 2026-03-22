//Develop inheritance-based Cricket–Match system using command line arguments

class Match {
    String team1, team2;

    Match(String t1, String t2) {
        team1 = t1;
        team2 = t2;
    }

    void displayTeams() {
        System.out.println("Team 1 : " + team1);
        System.out.println("Team 2 : " + team2);
    }
}

class CricketMatch extends Match {
    int score1, score2;

    CricketMatch(String t1, String t2, int s1, int s2) {
        super(t1, t2);
        score1 = s1;
        score2 = s2;
    }

    void displayScore() {
        System.out.println(team1 + " Score : " + score1);
        System.out.println(team2 + " Score : " + score2);
    }

    void showResult() {
        if (score1 > score2)
            System.out.println("Winner : " + team1);
        else if (score2 > score1)
            System.out.println("Winner : " + team2);
        else
            System.out.println("Match Result : Draw");
    }
}

public class Program5 {
    public static void main(String args[]) {

        if (args.length < 4) {
            System.out.println("Please enter arguments:");
            System.out.println("Example: java Program5 India Australia 250 230");
            return;
        }

        String team1 = args[0];
        String team2 = args[1];
        int score1 = Integer.parseInt(args[2]);
        int score2 = Integer.parseInt(args[3]);

        CricketMatch match = new CricketMatch(team1, team2, score1, score2);

        System.out.println("===== CRICKET MATCH RESULT =====");
        match.displayTeams();
        System.out.println("--------------------------------");
        match.displayScore();
        System.out.println("--------------------------------");
        match.showResult();
        System.out.println("================================");
    }
}