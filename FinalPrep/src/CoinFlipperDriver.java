import java.util.Scanner;

public class CoinFlipperDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many player are playing?");

		int playerCount = sc.nextInt();

		while (playerCount < 2) {
			System.out.println("You need at least two players.");
		}

		Person[] players = new Person[playerCount];

		for (int i = 0; i < players.length; i++) {
			System.out.println("What is the players name?");
			String playerName = sc.next();
			players[i] = new Person(playerName);
		}
		
		for(int i =0; i < playerCount; i++) {
			int result = players[i].getCoin().flipCoin();
			if(result == 0) {
				players[i].setHeadCount(players[i].getHeadCount()+1);
			}
			
		}
		
		System.out.println(decideWinner(players) + " won the game!");
		
	}

	private static Person decideWinner(Person[] players) {
		Person highestPointPlayer = new Person("I'm a person!");
		
		for(Person p: players) {
			if(p.getHeadCount() > highestPointPlayer.getHeadCount()) {
				
				highestPointPlayer = p;
			}
		}
		return highestPointPlayer;
		
	}

}
