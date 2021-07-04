package com.moringaschool.gamify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.ULocale;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.ViewCategoryButton) Button mViewCategoryButton;
    @BindView(R.id.category) EditText mCategory;
    @BindView(R.id.AppName) TextView mAppName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mViewCategoryButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String location = mCategory.getText().toString();
        Intent intent = new Intent(MainActivity.this, GamesList.class);
    }
}