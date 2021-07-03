package com.moringaschool.gamify;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.ULocale;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.ViewCategoryButton) Button mViewCategoryButton;
    @BindView(R.id.category) EditText mCategory;
    @BindView(R.id.AppName) TextView mAppName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}