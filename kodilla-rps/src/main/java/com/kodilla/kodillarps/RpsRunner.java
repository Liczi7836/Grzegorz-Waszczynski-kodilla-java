package com.kodilla.kodillarps;


import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        String name;
        int roundToWin;
        boolean end = false;
        int computerMove;
        String playerMove;
        int playerScore = 0;
        int computerScore = 0;
        System.out.println("Insert Your name:");
        Scanner scanName = new Scanner(System.in);
        name = scanName.nextLine();
        System.out.println("Player 1: " + name);
        System.out.println("Player 2: Computer");
        System.out.println("How many rounds to win?");
        Scanner scanRounds = new Scanner(System.in);
        roundToWin = scanRounds.nextInt();
        System.out.println("Rounds to win: " + roundToWin);
        Random rand = new Random();
        System.out.println("Moves:");
        System.out.println("1 - paper");
        System.out.println("2 - rock");
        System.out.println("3 - scissors");
        System.out.println("4 - lizard");
        System.out.println("5 - spock");

        while (!end) {
            int random2 = rand.nextInt(1000) + 1;

            System.out.println("Your move. (1-5)");
            Scanner scanPlayerMove = new Scanner(System.in);
            playerMove = scanPlayerMove.nextLine();

            if(Integer.parseInt(playerMove) == 1){

            if (random2 <= 125){
                computerMove = 2;
            } else if(random2 <= 250){
                computerMove = 5;
            } else if(random2 <= 500){
                computerMove = 1;
                } else if (random2 <= 750){
                computerMove = 3;
            } else {
                computerMove = 4;
            }
                if(Integer.parseInt(playerMove) == computerMove){
                    System.out.println("Draw!");
                } else if(computerMove == 2){
                    playerScore++;
                    System.out.println("Player win this battle.");
                } else if (computerMove == 3){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                } else if(computerMove == 4){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                } else if (computerMove == 5){
                    playerScore++;
                    System.out.println("Player win this battle.");
                }
            }
            if(Integer.parseInt(playerMove) == 2){

                if (random2 <= 125){
                    computerMove = 3;
                } else if(random2 <= 250){
                    computerMove = 4;
                } else if(random2 <= 500){
                    computerMove = 2;
                } else if (random2 <= 750){
                    computerMove = 1;
                } else {
                    computerMove = 5;
                }
                if(Integer.parseInt(playerMove) == computerMove){
                    System.out.println("Draw!");
                } else if (computerMove == 3){
                    playerScore++;
                    System.out.println("Player win this battle.");
                } else if(computerMove == 1){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                } else if(computerMove == 4){
                    playerScore++;
                    System.out.println("Player win this battle.");
                } else if(computerMove == 5){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                }
            }

            if (Integer.parseInt(playerMove) == 3){

                if (random2 <= 125){
                    computerMove = 1;
                } else if(random2 <= 250){
                    computerMove = 4;
                } else if(random2 <= 500){
                    computerMove = 3;
                } else if (random2 <= 750){
                    computerMove = 2;
                } else {
                    computerMove = 5;
                }
                if(Integer.parseInt(playerMove) == computerMove){
                    System.out.println("Draw!");
                } else if (computerMove == 1){
                    playerScore++;
                    System.out.println("Player win this battle.");
                } else if (computerMove == 2){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                } else if(computerMove == 4){
                    playerScore++;
                    System.out.println("Player win this battle.");
                } else if(computerMove == 5){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                }
            }

            if(Integer.parseInt(playerMove) == 4){

                if (random2 <= 125){
                    computerMove = 1;
                } else if(random2 <= 250){
                    computerMove = 5;
                } else if(random2 <= 500){
                    computerMove = 4;
                } else if (random2 <= 750){
                    computerMove = 2;
                } else {
                    computerMove = 3;
                }

                if(Integer.parseInt(playerMove) == computerMove){
                    System.out.println("Draw!");
                } else if (computerMove == 1){
                    playerScore++;
                    System.out.println("Player win this battle.");
                } else if (computerMove == 2){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                } else if(computerMove == 3){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                } else if (computerMove == 5){
                    playerScore++;
                    System.out.println("Player win this battle.");
                }
            }

            if (Integer.parseInt(playerMove) == 5){

                if (random2 <= 125){
                    computerMove = 2;
                } else if(random2 <= 250){
                    computerMove = 3;
                } else if(random2 <= 500){
                    computerMove = 5;
                } else if (random2 <= 750){
                    computerMove = 1;
                } else {
                    computerMove = 4;
                }
                if(Integer.parseInt(playerMove) == computerMove){
                    System.out.println("Draw!");
                } else if (computerMove == 1){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                } else if (computerMove == 2){
                    playerScore++;
                    System.out.println("Player win this battle.");
                } else if (computerMove == 3){
                    playerScore++;
                    System.out.println("Player win this battle.");
                } else if (computerMove == 4){
                    computerScore++;
                    System.out.println("Computer win this battle.");
                }
            }
            System.out.println("Player points: " + playerScore);
            System.out.println("Computer point: " + computerScore);

            if(playerMove.equals("x")){
                System.out.println("Are You sure You want to quit the game?");
                playerMove = scanPlayerMove.nextLine();
                if (playerMove.equals("yes")) {
                    end = true;
                }
            }

            if (playerMove.equals("n")){
                System.out.println("Are You sure You want to start over?");
                playerMove = scanPlayerMove.nextLine();
                if (playerMove.equals("yes")){
                    playerScore = 0;
                    computerScore = 0;

                }
            }



            if(playerScore == roundToWin || computerScore == roundToWin){
                System.out.println("Start again or end program? x to end, n to start again");
                playerMove = scanPlayerMove.nextLine();
                if(playerMove.equals("x")) {
                    end = true;
                } else if (playerMove.equals("n")){
                    System.out.println("Preparing new game.");
                    playerScore = 0;
                    computerScore = 0;
                    System.out.println("How many rounds to win?");
                    roundToWin = scanRounds.nextInt();
                    System.out.println("Rounds to win: " + roundToWin);
                }
            }
        }
        System.out.println("Player get " + playerScore + " points.");
        System.out.println("Computer get " + computerScore + " points.");
        if(playerScore > computerScore){
            System.out.println("Player wins!");
        } else if (computerScore > playerScore){
            System.out.println("Computer wins!");
        }


    }
}
