import java.util.Scanner;

public class UFC_App {
	static int opponentHealth = 100;
	static int playerHealth = 100;
	static String opponentName;
	static String playerName;
	int attack = 1;
	static int round = 1;

	public static void main(String[] args) {
		UFC_App ufc = new UFC_App();
		UFC_Attack attack = new UFC_Attack();
		UFC_Results results = new UFC_Results();
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println("             ______     ____      ");
		System.out.println("|      |    |          /    \\    ");
		System.out.println("|      |    |_____    /           ");
		System.out.println("|      |    |         |           ");
		System.out.println("\\      /    |         \\         ");
		System.out.println(" \\____/     |          \\____/   ");
		
		System.out.printf("\n\n\nEnter your name: ");
		playerName = scanner.nextLine();
		System.out.print("Enter opponents name: ");
		opponentName = scanner.nextLine();

		System.out.printf("\n\nWelcome to the UFC fight between %s and %s.\nAt any point press ENTER to continue the game.",ufc.opponentName, ufc.playerName);
		scanner.nextLine();

		System.out.printf("\n\n\n\n\n\n--- ROUND %d ---",round);
		attack.attack(ufc);
		attack.attack(ufc);
		attack.attack(ufc);
		results.roundResults(round, attack);
		if(ufc.opponentHealth<=0) {
			System.out.printf("\n%s has been defeated!", ufc.opponentName);
		} else {
			if(ufc.playerHealth<=0) {
				System.out.printf("\n%s has been defeated", ufc.playerName);
			} else {
				System.out.printf("\n\n\n\n\n\n--- ROUND %d ---",++round);
				attack.attack(ufc);
				attack.attack(ufc);
				attack.attack(ufc);
				results.roundResults(round, attack);
				if(ufc.opponentHealth<=0) {
					System.out.printf("\n%s has been defeated!", ufc.opponentName);
				} else {
					if(ufc.playerHealth<=0) {
						System.out.printf("\n%s has been defeated", ufc.playerName);
					} else {
						System.out.printf("\n\n\n\n\n\n--- ROUND %d ---",++round);
						attack.attack(ufc);
						attack.attack(ufc);
						attack.attack(ufc);
						results.fightResults(attack);
					}
				}
			}
		}
	}
}