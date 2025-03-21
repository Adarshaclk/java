public class Cricket {
    public static void matchData(String[] players, String day) {
        for (String name : players) {
            System.out.println("Name of the player is " + name + ", match will be on " + day);
        }
        System.out.println("");
    }

    public static void matchData(String name, int matches, float totalRuns) {
        System.out.println("Name of the player is " + name + ", number of matches played: " + matches + ", total score: " + totalRuns);
    }

    public static void matchData(String[] players,int[] score,int[] match,float[] avg) {
        for (int i=0;i<players.length;i++) {
            System.out.println("Name of the player is " + players[i]+"and the score is "+score[i]+"and number of matche played "+match[i]);
			System.out.println("averge of the player"+avg[i]);
			System.out.println("");
        }
		
    }
}