package method_challenge;

public class method_challenge {

	public static void main(String[] args) {

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Daniel", highScorePosition);

		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Tom", highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Bob", highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Tim", highScorePosition);

		highScorePosition = calculateHighScorePosition(25);
		displayHighScorePosition("Brad", highScorePosition);

	}

	public static void displayHighScorePosition(String player_name, int high_score_list) {

		System.out
				.println(player_name + " managed to get into postion " + high_score_list + " on the high score list.");

	}

	public static int calculateHighScorePosition(int players_score) {
		int position = 4;
		if (players_score >= 1000) {
			position = 1;
		} else if (players_score >= 500) {
			position = 2;
		} else if (players_score >= 100) {
			position = 3;
		

	}
		return position;
	}

}