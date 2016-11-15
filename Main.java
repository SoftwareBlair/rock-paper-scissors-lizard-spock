public class Main {

  public static void main(String[] args) {

    // Sets model variable to a new game
    GameModel model = new GameModel();
    // Sets scanner variable to terminal input
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Play game until the user quits
    while (true) {

      // Take input from user for weapon choice
      System.out.println("Rock, Paper, Scissors, Lizard, Spock... shoot!");
      System.out.print("Choose your weapon: ");
      String playerChoice = scanner.nextLine().toUpperCase();

      // Get random computer weapon
      String computerChoice = model.getRandomChoice();

      // Print out weapon choices
      System.out.println("\nYou chose " + playerChoice);
      System.out.println("The computer chose " + computerChoice + "\n");

      // Sets state of outcomes for game
      GameModel.GameOutcome outcome = model.getGameOutcome(playerChoice, computerChoice);

      // When the outcome is a win
      if (outcome == GameModel.GameOutcome.WIN) {
        // When user wins with ROCK
        if (playerChoice.equals("ROCK")) {

          if (computerChoice.equals("SCISSORS")) {
            System.out.println("Rock smashes Scissors");
          }
          else if (computerChoice.equals("LIZARD")) {
            System.out.println("Rock squishes Lizard");
          }
        }
        // When user wins with PAPER
        else if (playerChoice.equals("PAPER")) {

          if (computerChoice.equals("ROCK")) {
            System.out.println("Paper covers Rock");
          }
          else if (computerChoice.equals("SPOCK")) {
            System.out.println("Paper disproves Spock");
          }
        }
        // When user wins with SCISSORS
        else if (playerChoice.equals("SCISSORS")) {

          if (computerChoice.equals("PAPER")) {
            System.out.println("Scissors cuts Paper");
          }
          else if (computerChoice.equals("LIZARD")) {
            System.out.println("Scissors decapitates Lizard");
          }
        }
        // When user wins with LIZARD
        else if (playerChoice.equals("LIZARD")) {

          if (computerChoice.equals("PAPER")) {
            System.out.println("Lizard eats Paper");
          }
          else if (computerChoice.equals("SPOCK")) {
            System.out.println("Lizard poisons Spock");
          }
        }
        // When user wins with SPOCK
        else if (playerChoice.equals("SPOCK")) {

          if (computerChoice.equals("ROCK")) {
            System.out.println("Spock vaporizes Rock");
          }
          else if (computerChoice.equals("SCISSORS")) {
            System.out.println("Spock destroyes Scissors");
          }
        }
      }
      // When the outcome is a loss
      else if (outcome == GameModel.GameOutcome.LOSE) {
        // When user loses with ROCK
        if (playerChoice.equals("ROCK")) {

          if (computerChoice.equals("PAPER")) {
            System.out.println("Rock is covered by Paper");
          }
          else if (computerChoice.equals("SPOCK")) {
            System.out.println("Rock is vaporized by Spock");
          }
        }
        // When user loses with PAPER
        else if (playerChoice.equals("PAPER")) {

          if (computerChoice.equals("SCISSORS")) {
            System.out.println("Paper is cut by Scissors");
          }
          else if (computerChoice.equals("LIZARD")) {
            System.out.println("Paper is eaten by Lizard");
          }
        }
        // When user loses with SCISSORS
        else if (playerChoice.equals("SCISSORS")) {

          if (computerChoice.equals("ROCK")) {
            System.out.println("Scissors are smashed by Rock");
          }
          else if (computerChoice.equals("SPOCK")) {
            System.out.println("Scissors are destroyed by Spock");
          }
        }
        // When user loses with LIZARD
        else if (playerChoice.equals("LIZARD")) {

          if (computerChoice.equals("SCISSORS")) {
            System.out.println("Lizard is decapitated by Scissors");
          }
          else if (computerChoice.equals("ROCK")) {
            System.out.println("Lizard is squished by Rock");
          }
        }
        // When user loses with SPOCK
        else if (playerChoice.equals("SPOCK")) {

          if (computerChoice.equals("PAPER")) {
            System.out.println("Spock is disproved by Paper");
          }
          else if (computerChoice.equals("LIZARD")) {
            System.out.println("Spock is poisoned by Lizard");
          }
        }
      }
      // When the outcome is a tie
      else {
        System.out.println("It was a tie!");
      }

      // Prints total wins, losses and ties
      System.out.println("\nWins: " + model.getWins());
      System.out.println("Losses: " + model.getLosses());
      System.out.println("Ties: " + model.getTies());

      // End game at 3 wins or 3 losses
      if (model.getWins() == 3 || model.getLosses() == 3) {

        System.out.println("\nWould you like to play again, Yes or No?");

        String answer = scanner.nextLine();
        // If user doesn't enter yes or no
        if (answer.equals("")) {
          System.out.print("Please answer yes or no: ");
          answer = scanner.nextLine();
        }
        // If user wishes to keep playing
        if (answer.equalsIgnoreCase("yes")) {
          model = new GameModel();
        }
        // If user wishes to quit playing
        if (answer.equalsIgnoreCase("no")) {
          break;
        }
      }

    }

    scanner.close();
  }
}
