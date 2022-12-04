package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    Button mReturnButton;
    Button mPlayButton;
    TextView mResultText;

    @Override
    protected void  onCreate(Bundle savedInstanceState) {

        Log.d("RPS", "Result Activity onCreate called");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResultText = (TextView)findViewById(R.id.textView);
        mPlayButton = (Button) findViewById(R.id.round);
        mReturnButton = (Button) findViewById(R.id.bck);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String play = extras.getString("play");

        RockPaperScissor game = new RockPaperScissor(play);

        String result = game.getResult();
        if(game.userScore>4){
            mResultText.setText(" yo! User has Won the Match 🥷");
            mPlayButton.setText("Restart the Game");
        }
        else if(game.computerScore>4){
            mResultText.setText("Oops !  Computer has won the Match 💻");
            mPlayButton.setText("Restart the Game");
        }
        else {
            mResultText.setText(result + " the round" + " \n💻 " + game.computerScore + " \n🥷 " + game.userScore);
        }

        mReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Result.this, WelcomePage.class);
                startActivity(intent);
            }
        });

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Result.this,Play.class);
                startActivity(intent);
            }
        });
    }
}