package com.example.amabam.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.amabam.R;

public class home_games extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_games);
    }

    public void square_colors(View view) {
        Intent intent = new Intent(this, square_colors_game.class);
        startActivity(intent);
    }

    public void hangman_categories(View view) {
        Intent intent = new Intent(this, categories_hangman.class);
        startActivity(intent);
    }
}