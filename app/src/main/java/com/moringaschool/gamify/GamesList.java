package com.moringaschool.gamify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GamesList extends AppCompatActivity {
    private String[] games = new String[]{"White Tiles","Candy Crush","Pokemon","Word Cookie","Zombie Highway","Car Race","Ludo","Pool Billiard","Fifa 21","T.K.O","Temple Run2","Maze Runner","Escape Room","Fortnite","Arrows"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_list);
    }
}