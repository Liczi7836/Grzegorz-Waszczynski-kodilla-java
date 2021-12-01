package com.kodilla.kodillarps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final Random RANDOM = new Random();
    private final Scanner scanRounds = new Scanner(System.in);
    private int roundToWin;
    private boolean end = false;
    private Figure computerMove;
    private Figure playerMove;
    private int playerScore = 0;
    private int computerScore = 0;

    void play() {{

        String name = collectName();
        System.out.println("Player 1: " + name);
        System.out.println("Player 2: Computer");
        collectNrOfRounds();
        Utils.introduceMoves();

        while (!end) {
                int random2 = RANDOM.nextInt(1000) + 1;

                System.out.println("Your move. (1-5)");
                Scanner scanPlayerMove = new Scanner(System.in);
                String value = scanPlayerMove.nextLine();
                playerMove = Figure.valueOf(value);

                if (Figure.PAPER.equals(playerMove)) {

                    if (random2 <= 125) {
                        computerMove = Figure.ROCK;
                    } else if (random2 <= 250) {
                        computerMove = Figure.SPOCK;
                    } else if (random2 <= 500) {
                        computerMove = Figure.PAPER;
                    } else if (random2 <= 750) {
                        computerMove = Figure.SCISSORS;
                    } else {
                        computerMove = Figure.LIZARD;
                    }
                    if (Integer.parseInt(playerMove) == computerMove) {
                        System.out.println("Draw!");
                    } else if (computerMove == 2) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    } else if (computerMove == 3) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    } else if (computerMove == 4) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    } else if (computerMove == 5) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    }
                }
                if (Integer.parseInt(playerMove) == 2) {

                    if (random2 <= 125) {
                        computerMove = 3;
                    } else if (random2 <= 250) {
                        computerMove = 4;
                    } else if (random2 <= 500) {
                        computerMove = 2;
                    } else if (random2 <= 750) {
                        computerMove = 1;
                    } else {
                        computerMove = 5;
                    }
                    if (Integer.parseInt(playerMove) == computerMove) {
                        System.out.println("Draw!");
                    } else if (computerMove == 3) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    } else if (computerMove == 1) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    } else if (computerMove == 4) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    } else if (computerMove == 5) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    }
                }

                if (Integer.parseInt(playerMove) == 3) {

                    if (random2 <= 125) {
                        computerMove = 1;
                    } else if (random2 <= 250) {
                        computerMove = 4;
                    } else if (random2 <= 500) {
                        computerMove = 3;
                    } else if (random2 <= 750) {
                        computerMove = 2;
                    } else {
                        computerMove = 5;
                    }
                    if (Integer.parseInt(playerMove) == computerMove) {
                        System.out.println("Draw!");
                    } else if (computerMove == 1) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    } else if (computerMove == 2) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    } else if (computerMove == 4) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    } else if (computerMove == 5) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    }
                }

                if (Integer.parseInt(playerMove) == 4) {

                    if (random2 <= 125) {
                        computerMove = 1;
                    } else if (random2 <= 250) {
                        computerMove = 5;
                    } else if (random2 <= 500) {
                        computerMove = 4;
                    } else if (random2 <= 750) {
                        computerMove = 2;
                    } else {
                        computerMove = 3;
                    }

                    if (Integer.parseInt(playerMove) == computerMove) {
                        System.out.println("Draw!");
                    } else if (computerMove == 1) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    } else if (computerMove == 2) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    } else if (computerMove == 3) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    } else if (computerMove == 5) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    }
                }

                if (Integer.parseInt(playerMove) == 5) {

                    if (random2 <= 125) {
                        computerMove = 2;
                    } else if (random2 <= 250) {
                        computerMove = 3;
                    } else if (random2 <= 500) {
                        computerMove = 5;
                    } else if (random2 <= 750) {
                        computerMove = 1;
                    } else {
                        computerMove = 4;
                    }
                    if (Integer.parseInt(playerMove) == computerMove) {
                        System.out.println("Draw!");
                    } else if (computerMove == 1) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    } else if (computerMove == 2) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    } else if (computerMove == 3) {
                        playerScore++;
                        System.out.println("Player win this battle.");
                    } else if (computerMove == 4) {
                        computerScore++;
                        System.out.println("Computer win this battle.");
                    }
                }
                System.out.println("Player points: " + playerScore);
                System.out.println("Computer point: " + computerScore);

                if (playerMove.equals("x")) {
                    System.out.println("Are You sure You want to quit the game?");
                    playerMove = scanPlayerMove.nextLine();
                    if (playerMove.equals("yes")) {
                        end = true;
                    }
                }

                if (playerMove.equals("n")) {
                    System.out.println("Are You sure You want to start over?");
                    playerMove = scanPlayerMove.nextLine();
                    if (playerMove.equals("yes")) {
                        playerScore = 0;
                        computerScore = 0;

                    }
                }

                if (playerScore == roundToWin || computerScore == roundToWin) {
                    System.out.println("Start again or end program? x to end, n to start again");
                    playerMove = scanPlayerMove.nextLine();
                    if (playerMove.equals("x")) {
                        end = true;
                    } else if (playerMove.equals("n")) {
                        System.out.println("Preparing new game.");
                        playerScore = 0;
                        computerScore = 0;
                        System.out.println("How many rounds to win?");
                        roundToWin = scanPlayerMove.nextInt();
                        System.out.println("Rounds to win: " + roundToWin);
                    }
                }
            }
            System.out.println("Player get " + playerScore + " points.");
            System.out.println("Computer get " + computerScore + " points.");
            if (playerScore > computerScore) {
                System.out.println("Player wins!");
            } else if (computerScore > playerScore) {
                System.out.println("Computer wins!");
            }
        }
    }

    private int collectNrOfRounds() {
        System.out.println("How many rounds to win?");
        roundToWin = scanRounds.nextInt();
        System.out.println("Rounds to win: " + roundToWin);
        return roundToWin;
    }

    private String collectName() {
        System.out.println("Insert Your name:");
        Scanner scanName = new Scanner(System.in);
        return scanName.nextLine();
    }
}
