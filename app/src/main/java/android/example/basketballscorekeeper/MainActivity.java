package android.example.basketballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int WinA=0;
    int WinB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsForA(View view) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
        displayMessage("");
    }

    public void twoPointsForA(View view) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
        displayMessage("");
    }

    public void onePointForA(View view) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
        displayMessage("");
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWinForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_win);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsForB(View view) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
        displayMessage("");
    }

    public void twoPointsForB(View view) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
        displayMessage("");
    }

    public void onePointForB(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
        displayMessage("");
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWinForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_win);
        scoreView.setText(String.valueOf(score));
    }

    private void displayMessage(String msg) {
        TextView message = (TextView) findViewById(R.id.message);
        message.setText(msg);
    }

    public void newGame(View view){
        if(scoreTeamB > scoreTeamA)
        {
            displayMessage("Team B Win: " + scoreTeamB + " - " + scoreTeamA);
            WinB++;
            displayWinForTeamB(WinB);

        }
        else if(scoreTeamA > scoreTeamB)
        {
            displayMessage("Team A Win: " + scoreTeamA + " - " + scoreTeamB);
            WinA++;
            displayWinForTeamA(WinA);
        }
        else{
            displayMessage("It's a Tie: " + scoreTeamA + " - " + scoreTeamB);
        }
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        WinA=0;
        WinB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayWinForTeamA(WinA);
        displayWinForTeamB(WinB);
        displayMessage("");
    }

}
