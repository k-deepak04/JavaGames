package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
////        setContentView(R.layout.activity_main);
    }
    public void tictactoe(View view){
        Intent i1=new Intent(WelcomePage.this,TicTacToe.class);
        startActivity(i1);
    }
    public void web(View view){
        Intent i1=new Intent(WelcomePage.this,Web.class);
        startActivity(i1);
    }
    public void wordgame(View view){
        Intent i1=new Intent(WelcomePage.this,Play.class);
        startActivity(i1);
    }
    public void Flyhigh(View view){
        Intent i1=new Intent(WelcomePage.this,Flymain.class);
        startActivity(i1);
    }

}