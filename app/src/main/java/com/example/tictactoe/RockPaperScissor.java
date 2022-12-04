package com.example.tictactoe;

import static android.content.Intent.getIntent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RockPaperScissor {

    HashMap<String, String> moves = new HashMap<>();
    String mPlayerMove;
    String mComputerMove;

    public RockPaperScissor(String move) {
        this.mPlayerMove = move;
        this.mComputerMove = null;
        setUpMoves();
    }


    public void setUpMoves() {
        moves.put("Scissors", "Paper");
        moves.put("Paper", "Rock");
        moves.put("Rock", "Scissors");
    }

    public void computerMove() {
        Random rand = new Random();
        ArrayList<String> movesArray = new ArrayList<>();
        for(String key : moves.keySet()) {
            movesArray.add(key);
        }
        int randomIndex = rand.nextInt(3);
        String randomAnswer = movesArray.get(randomIndex);
        this.mComputerMove = randomAnswer;
    }

    public boolean win() {
        return (moves.get(mPlayerMove).equals(mComputerMove));
    }

    public boolean lose(){
        return (moves.get(mComputerMove).equals(mPlayerMove));
    }
    static int userScore ;
    static int computerScore;

    public String getResult() {
        computerMove();
        String outcome = null;
        if(userScore==5 || computerScore==5){
            userScore=0;
            computerScore=0;
        }
        if (win()) {
            userScore += 1;
            outcome = "You win! ";
        } else if (lose()) {
            computerScore += 1;
            outcome = "Computer wins! ";
        } else {
            outcome = "It's a draw! Nobody wins ";
        }
        return outcome;
    }


}
