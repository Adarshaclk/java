class CricketRunner {
    public static void main(String[] args) {
        String[] players = { "Virat", "ABD" };
        String day = "Wednesday";
        Cricket.matchData(players, day);
		{
        String name = "DK";
        int match = 50;
        int total = 1038;
        float avg = (float) total / match; 
        Cricket.matchData(name, match, avg);
		}
		{
        String[] names = { "Virat", "DK", "Chahal" };
        int[] score={353,490,717};
		int[] match={13,45,56};
		float[] avg={0,0,0};
		for(int i=0;i<score.length;i++){
		 float a=score[i]/match[i];
		 avg[i]=a;
		}
        Cricket.matchData(names,score,match,avg);
		}
    }
}
