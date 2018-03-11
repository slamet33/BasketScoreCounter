package com.example.android.basketscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    /*
    TeamAConfig
     */
    public void teamAOneScore(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    public void teamATwoScore (View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void teamAThreeScore (View view){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" +score);
    }

    public void teamBOneScore(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void teamBTwoScore (View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void teamBThreeScore (View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }


    private void displayForTeamB(int score) {
        TextView scoreView =(TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" +score);
    }

    public void resetButton(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
