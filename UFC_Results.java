import java.util.Scanner;

public class UFC_Results {
	UFC_App ufc = new UFC_App();
	UFC_Attack attack = new UFC_Attack();
	Scanner scanner = new Scanner(System.in);

	public void roundResults(int roundNum, UFC_Attack attack) {
		scanner.nextLine();
		System.out.print("\n\n--- ROUND " + roundNum + " RESULTS ---");
		scanner.nextLine();
		if(ufc.opponentHealth == ufc.playerHealth) {
			System.out.printf("\n%s and %s are tied with %d health points remaining.", ufc.opponentName, ufc.playerName, ufc.playerHealth);
		} else {
			if(ufc.opponentHealth > ufc.playerHealth) {
				System.out.printf("\n%s is winning with %d health points, %s has %s health points remaining.", ufc.opponentName, ufc.opponentHealth, ufc.playerName, ufc.playerHealth);
			} else {
				System.out.printf("\n%s is winning with %d health points, %s has %s health points remaining.", ufc.playerName, ufc.playerHealth, ufc.opponentName, ufc.opponentHealth);
			}
		}
		scanner.nextLine();
	}

	public void fightResults(UFC_Attack attack) {
		scanner.nextLine();
		System.out.print("\n\n\n--- FIGHT RESULTS ---");
		scanner.nextLine();
		if(ufc.opponentHealth == ufc.playerHealth) {
			System.out.printf("\n%s and %s are tied with %d health points remaining.\n\n\n", ufc.opponentName, ufc.playerName, ufc.playerHealth);
		} else {
			if(ufc.opponentHealth > ufc.playerHealth) {
				System.out.printf("\n%s is the winner with %d health points remaining, %s has %d health points remaining.\n\n\n", ufc.opponentName, ufc.opponentHealth, ufc.playerName, ufc.playerHealth);
			} else {
				System.out.printf("\n%s is the winner with %d health points remaining, %s has %d health points remaining.\n\n\n", ufc.playerName, ufc.playerHealth, ufc.opponentName, ufc.opponentHealth);
			}
		}
	}	
}