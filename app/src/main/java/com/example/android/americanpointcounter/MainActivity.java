package com.example.android.americanpointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    static final String STATE_POINT_A = "points A";
    static final String STATE_POINT_B = "points B";
    static final String STATE_FAULT_A = "faults A";
    static final String STATE_FAULT_B = "faults B";
    int pointsA = 0;
    int pointsB = 0;
    int faultsA = 0;
    int faultsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            pointsA = savedInstanceState.getInt(STATE_POINT_A);
            pointsB = savedInstanceState.getInt(STATE_POINT_B);
            faultsA = savedInstanceState.getInt(STATE_FAULT_A);
            faultsB = savedInstanceState.getInt(STATE_FAULT_B);
            TextView aPoints = findViewById(R.id.team_a_score);
            TextView bPoints = findViewById(R.id.team_b_score);
            TextView aFaults = findViewById(R.id.team_a_faults);
            TextView bFaults = findViewById(R.id.team_b_faults);
            displayPointsForTeamA(pointsA);
            displayPointsForTeamB(pointsB);
            displayFaultsForTeamA(faultsA);
            displayFaultsForTeamB(faultsB);

        } else {
            // Probably initialize members with default values for a new instance
        }

    }

    // points and faults for teamA and displaying them
    public void points6A(View view) {
        pointsA = pointsA + 6;
        displayPointsForTeamA(pointsA);
    }

    public void points3A(View view) {
        pointsA = pointsA + 3;
        displayPointsForTeamA(pointsA);
    }

    public void points2A(View view) {
        pointsA = pointsA + 2;
        displayPointsForTeamA(pointsA);
    }

    public void point1A(View view) {
        pointsA = pointsA + 1;
        displayPointsForTeamA(pointsA);
    }

    public void faultA(View view) {
        faultsA = faultsA + 1;
        displayFaultsForTeamA(faultsA);
    }

    //points and faults for teamB and displaying them
    public void points6B(View view) {
        pointsB = pointsB + 6;
        displayPointsForTeamB(pointsB);
    }

    public void points3B(View view) {
        pointsB = pointsB + 3;
        displayPointsForTeamB(pointsB);
    }

    public void points2B(View view) {
        pointsB = pointsB + 2;
        displayPointsForTeamB(pointsB);
    }

    public void point1B(View view) {
        pointsB = pointsB + 1;
        displayPointsForTeamB(pointsB);
    }

    public void faultB(View view) {
        faultsB = faultsB + 1;
        displayFaultsForTeamB(faultsB);
    }

    //points and faults reset

    public void resetGame (View view){
        pointsA = 0;
        pointsB = 0;
        faultsA = 0;
        faultsB = 0;
        displayPointsForTeamA(pointsA);
        displayPointsForTeamB(pointsB);
        displayFaultsForTeamA(faultsA);
        displayFaultsForTeamB(faultsB);
    }

    public void resetFaults (View viev) {
        faultsA = 0;
        faultsB = 0;
        displayFaultsForTeamA(faultsA);
        displayFaultsForTeamB(faultsB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayPointsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given faults for Team A.
     */
    public void displayFaultsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_faults);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayPointsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given faults for Team B.
     */
    public void displayFaultsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_faults);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(STATE_POINT_A, pointsA);
        savedInstanceState.putInt(STATE_POINT_B, pointsB);
        savedInstanceState.putInt(STATE_FAULT_A, faultsA);
        savedInstanceState.putInt(STATE_FAULT_B, faultsB);


        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }
}

