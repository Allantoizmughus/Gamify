package com.moringaschool.gamify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GamesListActivity extends AppCompatActivity {
    @BindView(R.id.CategoryList) TextView mCategoryView;
    @BindView(R.id.listView) ListView mListView;

    private String[] games = new String[]{"White Tiles","Candy Crush","Pokemon","Word Cookie","Zombie Highway","Car Race","Ludo","Pool Billiard","Fifa 21","T.K.O","Temple Run2","Maze Runner","Escape Room","Fortnite","Arrows"};

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_list);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,games);
        mListView.setAdapter(adapter);

        Intent intent= getIntent();
        String category = intent.getStringExtra("category");
        mCategoryView.setText("Here are all the games in Category "+category);

    }
}