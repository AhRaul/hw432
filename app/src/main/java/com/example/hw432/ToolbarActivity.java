package com.example.hw432;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ToolbarActivity extends AppCompatActivity {

    private ProgressBar progressBarRound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        progressBarRound = findViewById(R.id.progressBar);

        progressBarRound.setVisibility(View.INVISIBLE);

        Button showProgressBar = (Button) findViewById(R.id.button_show_pb);
        showProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBarRound.setVisibility(View.VISIBLE);
            }
        });

        Button hideProgressBar = (Button) findViewById(R.id.button_hide_pb);
        hideProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBarRound.setVisibility(View.INVISIBLE);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
