public class GameModel {

  private int wins = 0;
  private int losses = 0;
  private int ties = 0;

  // Setting constants for WIN, LOSE or TIE
  public static enum GameOutcome {
      WIN, LOSE, TIE;
  }

  public GameOutcome getGameOutcome(String userChoice, String computerChoice) {
    // If user chooses ROCK
    if (userChoice.equalsIgnoreCase("ROCK")) {

      if (computerChoice.equals("PAPER")) {
        // Rock is covered by Paper
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("SPOCK")) {
        // Rock is vaporized by Spock
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("SCISSORS")) {
        // Rock smashes Scissors
        wins++;
        return GameOutcome.WIN;
      }
      else if (computerChoice.equals("LIZARD")) {
        // Rock smashes Lizard
        wins++;
        return GameOutcome.WIN;
      }
    }
    // If user chooses PAPER
    else if (userChoice.equalsIgnoreCase("PAPER")) {

      if (computerChoice.equals("SCISSORS")) {
        // Paper is cut by Scissors
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("LIZARD")) {
        // Paper is eaten by Lizard
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("ROCK")) {
        // Paper covers Rock
        wins++;
        return GameOutcome.WIN;
      }
      else if (computerChoice.equals("SPOCK")) {
        // Paper disproves Spock
        wins++;
        return GameOutcome.WIN;
      }
    }
    // If user chooses SCISSORS
    else if (userChoice.equalsIgnoreCase("SCISSORS")) {

      if (computerChoice.equals("ROCK")) {
        // Scissors are smashed by Rock
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("SPOCK")) {
        // Scissors are destroyed by Spock
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("PAPER")) {
        // Scissors cuts Paper
        wins++;
        return GameOutcome.WIN;
      }
      else if (computerChoice.equals("LIZARD")) {
        // Scissors decapitates Lizard
        wins++;
        return GameOutcome.WIN;
      }
    }
    // If user chooses LIZARD
    else if (userChoice.equalsIgnoreCase("LIZARD")) {

      if (computerChoice.equals("SCISSORS")) {
        // Lizard is decapitated by Scissors
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("ROCK")) {
        // Lizard is smashed by Rock
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("PAPER")) {
        // Lizard eats Paper
        wins++;
        return GameOutcome.WIN;
      }
      else if (computerChoice.equals("SPOCK")) {
        // Lizard poisons Spock
        wins++;
        return GameOutcome.WIN;
      }
    }
    // If user chooses SPOCK
    else if (userChoice.equalsIgnoreCase("SPOCK")) {

      if (computerChoice.equals("PAPER")) {
        // Spock is disproved by Paper
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("LIZARD")) {
        // Spock is poisoned by Lizard
        losses++;
        return GameOutcome.LOSE;
      }
      else if (computerChoice.equals("ROCK")) {
        // Spock vaporizes Rock
        wins++;
        return GameOutcome.WIN;
      }
      else if (computerChoice.equals("SCISSORS")) {
        // Spock destroyes Scissors
        wins++;
        return GameOutcome.WIN;
      }
    }
    // If none of the conditions above are met, then the game is a tie
    ties++;
    return GameOutcome.TIE;
  }

  // Logic for Computer to choose ROCK, PAPER, SCISSORS, LIZARD or SPOCK
  public String getRandomChoice() {
    double compChoose = Math.random();

    if (compChoose < 0.198) {
      return "ROCK";
    }
    else if (compChoose >= 0.198 && compChoose < 0.396) {
      return "PAPER";
    }
    else if (compChoose >= 0.396 && compChoose < 0.594) {
      return "SCISSORS";
    }
    else if (compChoose >= 0.594 && compChoose < 0.792) {
      return "LIZARD";
    }
    else {
      return "SPOCK";
    }
  }

  // Setting wins, losses and ties to public methods
  public int getWins() {
    return wins;
  }

  public int getLosses() {
    return losses;
  }

  public int getTies() {
    return ties;
  }
}
