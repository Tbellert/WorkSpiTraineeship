import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the guess the number game!");
		System.out.println("Game rules");
		System.out.println("The computer will generate a random number betweeen two boundaries and you need to guess what number this is.");
		System.out.println("You play three rounds, with five guesses per round.");
		System.out.println("1: Start standard game (0-100)");
		System.out.println("2: Start a custom game (Choose lower and upper bound)");
		System.out.println("3: Start a multiplayer game (0-100)");

		Scanner start = new Scanner(System.in);
		String menuInput = start.nextLine();

		if (menuInput.equals("1")) {
			runGame(0, 100);
		}

		if (menuInput.equals("2")) {
			System.out.print("Put in a lower bound: ");
			int min = Integer.valueOf(start.nextLine());
			System.out.print("Put in an upper bound: ");
			int max = Integer.valueOf(start.nextLine());

			runGame(min, max);
		}

		if (menuInput.equals("3")) {
			System.out.print("Geef de naam van speler 1: ");
			String name1 = start.nextLine();
			System.out.print("Geef de naam van speler 2: ");
			String name2 = start.nextLine();
			runGame(0, 100, name1, name2);
		}
	}

	public static void runGame(int min, int max) {
		int numberOfWins = 0;
		int totalGuesses = 0;
		for (int rounds = 0; rounds < 3; rounds++) {
			boolean gameState = true;
			int randomNumber = (int) Math.floor(Math.random() * ((max - min + 1) + min));
			System.out.println("The number is: " + randomNumber);
			int numberOfGuesses = 5;

			System.out.println("Round: " + (rounds + 1) + "!");
			while (gameState && numberOfGuesses > 0) {
				System.out.println("Guess a number.");
				Scanner scanner = new Scanner(System.in);
				int answer = scanner.nextInt();

				if (answer < randomNumber) {
					System.out.println("The number needs to be higher");
					numberOfGuesses--;
					if (numberOfGuesses == 0) {
						continue;
					}
					System.out.println("You have " + numberOfGuesses + " guess(es) left.");

				} else if (answer > randomNumber) {
					System.out.println("The number needs to be lower");
					numberOfGuesses--;
					if (numberOfGuesses == 0) {
						continue;
					}
					System.out.println("You have " + numberOfGuesses + " guess(es) left.");

				} else if (answer == randomNumber) {
					System.out.println("You won!! Fireworks and Cake");
					System.out.println();
					gameState = false;
					numberOfWins++;
				}
				totalGuesses++;
			}
			if (numberOfGuesses == 0) {
				System.out.println("You lost this round, try again!");
				System.out.println();
			}

		}

		System.out.println("You lost the game! In total you managed to win " + numberOfWins
				+ " rounds, using a total of " + totalGuesses + " guesses. Well done.");
	}

	public static void runGame(int min, int max, String name1, String name2) {
		boolean isItPlayerOnesTurn = true;
		for (int rounds = 0; rounds < 3; rounds++) {
			boolean gameState = true;
			int randomNumber = (int) Math.floor(Math.random() * ((max - min + 1) + min));
			System.out.println("The number is: " + randomNumber);

			System.out.println("Round: " + (rounds + 1) + "!");
			while (gameState) {
				if(isItPlayerOnesTurn) {
					System.out.print("It's " + name1 + "'s turn. ");
					isItPlayerOnesTurn = false;
				} else {
					System.out.print("It's " + name2 + "'s turn. ");
					isItPlayerOnesTurn = true;
				}
				System.out.println("Guess a number.");
				Scanner scanner = new Scanner(System.in);
				int answer = scanner.nextInt();

				if (answer < randomNumber) {
					System.out.println("The number needs to be higher");
				} else if (answer > randomNumber) {
					System.out.println("The number needs to be lower");
				} else if (answer == randomNumber) {
					System.out.println("You won!! Fireworks and Cake");
					System.out.println();
					gameState = false;
					if(isItPlayerOnesTurn) {
						System.out.println(name1 + " has won the game!");
						System.out.println();
					} else {
						System.out.println(name2 + " has won the game!");
						System.out.println();
					}
				}
			}
		}
	}
}

