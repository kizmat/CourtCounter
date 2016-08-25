package com.tribe9.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aScore = 0;
    int bScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    Team A Methods

    public void aThree (View view) {
        aScore = aScore + 3;
        displayA(aScore);

    }

    public void aTwo (View view) {
        aScore = aScore + 2;
        displayA(aScore);
    }

    public void aOne (View view) {
        aScore = aScore + 1;
        displayA(aScore);
    }

    private void displayA(int number) {

        TextView teamAscore = (TextView) findViewById(
                R.id.teamAscore);
        teamAscore.setText("" + number);
    }

    //    Team B Methods

    public void bThree (View view) {
        bScore = bScore + 3;
        displayB(bScore);

    }

    public void bTwo (View view) {
        bScore = bScore + 2;
        displayB(bScore);
    }

    public void bOne (View view) {
        bScore = bScore + 1;
        displayB(bScore);
    }

    private void displayB(int number) {

        TextView teambScore = (TextView) findViewById(
                R.id.teamBscore);
        teambScore.setText("" + number);
    }
    // Reset Method Code
    public void reset (View view) {
        aScore = 0;
        bScore = 0;
        displayA(aScore);
        displayB(bScore);
    }
}
