import java.util.Random;
import java.util.Scanner;

public class UFC_Attack {
	
	public void attack(UFC_App app) {
		Random randomNumber = new Random();
		UFC_App ufc = new UFC_App();
		Scanner scanner = new Scanner(System.in);

		int randomOpponentAttack1 = 1 + randomNumber.nextInt(10);
		int randomOpponentDefend1 = 1 + randomNumber.nextInt(10);
		int randomPlayerAttack1 = 1 + randomNumber.nextInt(10);
		int randomPlayerDefend1 = 1 + randomNumber.nextInt(10);

		scanner.nextLine();
		if(randomOpponentAttack1 > randomPlayerAttack1) {
			if(randomOpponentAttack1 > randomPlayerDefend1) {
				for(int playerDefend = randomPlayerDefend1; playerDefend < randomOpponentAttack1; playerDefend ++) {
					System.out.printf("\n%s attacks for %d points!",ufc.opponentName, randomOpponentAttack1 = 1 + randomNumber.nextInt(10));
					if (randomOpponentAttack1 < randomPlayerDefend1) {
						System.out.printf("\n\t%s blocks the attack!", ufc.playerName);
					} else {
						ufc.playerHealth -= randomOpponentAttack1;
					}
				}
			} else {
				System.out.printf("\n%s attacks for %d points!", ufc.opponentName, randomOpponentAttack1);
				System.out.printf("\n\t%s blocks the attack!", ufc.playerName);
			}
		} else {
			if(randomPlayerAttack1 > randomOpponentDefend1) {
				for(int opponentDefend = randomOpponentDefend1; opponentDefend < randomPlayerAttack1; opponentDefend ++) {
					System.out.printf("\n%s attacks for %d points!",ufc.playerName, randomPlayerAttack1 = 1 + randomNumber.nextInt(10));
					if (randomPlayerAttack1 < randomOpponentDefend1) {
						System.out.printf("\n\t%s blocks the attack!", ufc.opponentName);
					} else {
						ufc.opponentHealth -= randomPlayerAttack1;
					}
				}
			} else {
				System.out.printf("\n%s attacks for %d points!", ufc.playerName, randomPlayerAttack1);
				System.out.printf("\n\t%s blocks the attack!", ufc.opponentName);
			}
		}
	}
}