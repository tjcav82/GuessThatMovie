package com.tjcav82gmail.guessthatmovie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Genre extends AppCompatActivity {
    Button action;
    Button comedy;
    Button horror;
    Button romance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Genre.this, ActionLevel.class);
                startActivity(intent);
            }
        });

        horror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Genre.this, Horror.class);
                startActivity(intent);
            }
        });

        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Genre.this, Romance.class);
                startActivity(intent);
            }
        });

        comedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Genre.this, Comedy.class);
                startActivity(intent);
            }
        });
    }
}
