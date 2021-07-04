package com.moringaschool.gamify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GamesList extends AppCompatActivity {
    @BindView(R.id.CategoryList) TextView mCategoryView;
    @BindView(R.id.listView) ListView mListView;

    private String[] games = new String[]{"White Tiles","Candy Crush","Pokemon","Word Cookie","Zombie Highway","Car Race","Ludo","Pool Billiard","Fifa 21","T.K.O","Temple Run2","Maze Runner","Escape Room","Fortnite","Arrows"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_list);
        ButterKnife.bind(this);


    }
}