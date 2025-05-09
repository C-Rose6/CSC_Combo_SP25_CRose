import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many players are there?");
		int playerCount = input.nextInt();

		System.out.println("Enter the number of sides for the die in use:");
		int dieSides = input.nextInt();

		while (playerCount < 2) {
			System.out.println("You need at least two players");
		}

		Player[] players = new Player[playerCount];

		for (int i = 0; i < players.length; i++) {
			System.out.println("What is the players name?");
			String playerName = input.next();
			players[i] = new Player(playerName, dieSides);
		}

		for (int i = 0; i < players.length; i++) {
			int highRoll = 0;
			int result = players[i].getDie().Roll();
			System.out.println(players[i].getName() + " rolled " + result + " on a " + dieSides + " sided die.");
		}
		
		System.out.println(players[decideWinner(players)] + " won the game!");
	}

	private static int  decideWinner(Player[] players) {
		int winner = -1;
		int highDie = 0;
		for (int i =0; i < players.length; i++) {
			if (players[i].getDie().getValue() > highDie) {
				highDie = players[i].getDie().getValue();
				winner = i;
			}
		}
		return winner;

	}
}
