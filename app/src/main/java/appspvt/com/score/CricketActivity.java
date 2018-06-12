package appspvt.com.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class CricketActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int outTeamA = 0;
    int outTeamB = 0;

    int oversTeamA = 9;
    int ballsTeamA = 6;

    int oversTeamB = 9;
    int ballsTeamB = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);

        //call the method to display score of team A and Team B
        displayScoreForTeamA(0);
        displayScoreForTeamB(0);

        //call the method to display no. of players out from team A and Team B
        displayOutFromTeamA(0);
        displayOutFromTeamB(0);

        //call the method to display the remaining overs and balls of Team A
        displayOversForTeamA(9);
        displayBallsForTeamA(6);

        //call the method to display the remaining overs and balls of Team B
        displayOversForTeamB(9);
        displayBallsForTeamB(6);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOversForTeamA(int overs) {
        TextView oversView = findViewById(R.id.overs_team_a);
        oversView.setText(String.valueOf(overs));
    }

    public void displayBallsForTeamA(int balls) {
        TextView ballsView = findViewById(R.id.balls_team_a);
        ballsView.setText(String.valueOf(balls));
    }

    // Add +6 run to team A
    public void addSixForTeamA(View v) {
        if (outTeamA < 10 && ballsTeamA > 0) {
            scoreTeamA = scoreTeamA + 6;
            ballsTeamA = ballsTeamA - 1;

            displayScoreForTeamA(scoreTeamA);
            if (ballsTeamA == 0 && oversTeamA > 0) {
                oversTeamA = oversTeamA - 1;
                ballsTeamA = 6;
            }
            displayOversForTeamA(oversTeamA);
            displayBallsForTeamA(ballsTeamA);
        }

    }

    // Add +4 run to team A
    public void addFourForTeamA(View v) {
        if (outTeamA < 10 && ballsTeamA > 0) {
            scoreTeamA = scoreTeamA + 4;
            ballsTeamA = ballsTeamA - 1;

            displayScoreForTeamA(scoreTeamA);
            if (ballsTeamA == 0 && oversTeamA > 0) {
                oversTeamA = oversTeamA - 1;
                ballsTeamA = 6;
            }
            displayOversForTeamA(oversTeamA);
            displayBallsForTeamA(ballsTeamA);
        }
    }

    // Add +1 run to team A
    public void addOneForTeamA(View v) {
        if (outTeamA < 10 && ballsTeamA > 0) {
            scoreTeamA = scoreTeamA + 1;
            ballsTeamA = ballsTeamA - 1;

            displayScoreForTeamA(scoreTeamA);
            if (ballsTeamA == 0 && oversTeamA > 0) {
                oversTeamA = oversTeamA - 1;
                ballsTeamA = 6;
            }
            displayOversForTeamA(oversTeamA);
            displayBallsForTeamA(ballsTeamA);
        }

    }


    public void displayOutFromTeamA(int out) {
        TextView outView = findViewById(R.id.team_a_out);
        outView.setText(String.valueOf(out));
    }

    // to count and display the total no. players from team A
    public void oneOutFromTeamA(View v) {
        if (outTeamA < 10 && ballsTeamA > 0) {
            outTeamA = outTeamA + 1;
            ballsTeamA = ballsTeamA - 1;

            displayOutFromTeamA(outTeamA);
            if (ballsTeamA == 0 && oversTeamA > 0) {
                oversTeamA = oversTeamA - 1;
                ballsTeamA = 6;
            }
            displayOversForTeamA(oversTeamA);
            displayBallsForTeamA(ballsTeamA);
        }
    }

    // For reset the score of Team A
    public void resetScoreOfTeamA(View v) {
        scoreTeamA = 0;
        outTeamA = 0;
        oversTeamA = 9;
        ballsTeamA = 6;
        displayScoreForTeamA(scoreTeamA);
        displayOutFromTeamA(outTeamA);
        displayOversForTeamA(oversTeamA);
        displayBallsForTeamA(ballsTeamA);

    }


    public void displayScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOversForTeamB(int overs) {
        TextView oversView = findViewById(R.id.overs_team_b);
        oversView.setText(String.valueOf(overs));
    }

    public void displayBallsForTeamB(int balls) {
        TextView ballsView = findViewById(R.id.balls_team_b);
        ballsView.setText(String.valueOf(balls));
    }

    // Add +6 run to team B
    public void addSixForTeamB(View v) {
        if (outTeamB < 10 && ballsTeamB > 0) {
            scoreTeamB = scoreTeamB + 6;
            ballsTeamB = ballsTeamB - 1;

            displayScoreForTeamB(scoreTeamB);
            if (ballsTeamB == 0 && oversTeamB > 0) {
                oversTeamB = oversTeamB - 1;
                ballsTeamB = 6;
            }
            displayOversForTeamB(oversTeamB);
            displayBallsForTeamB(ballsTeamB);
        }
    }

    // Add +4 run to team B
    public void addFourForTeamB(View v) {
        if (outTeamB < 10 && ballsTeamB > 0) {
            scoreTeamB = scoreTeamB + 4;
            ballsTeamB = ballsTeamB - 1;

            displayScoreForTeamB(scoreTeamB);
            if (ballsTeamB == 0 && oversTeamB > 0) {
                oversTeamB = oversTeamB - 1;
                ballsTeamB = 6;
            }
            displayOversForTeamB(oversTeamB);
            displayBallsForTeamB(ballsTeamB);
        }
    }

    // Add +1 run to team B
    public void addOneForTeamB(View v) {
        if (outTeamB < 10 && ballsTeamB > 0) {
            scoreTeamB = scoreTeamB + 1;
            ballsTeamB = ballsTeamB - 1;

            displayScoreForTeamB(scoreTeamB);
            if (ballsTeamB == 0 && oversTeamB > 0) {
                oversTeamB = oversTeamB - 1;
                ballsTeamB = 6;
            }
            displayOversForTeamB(oversTeamB);
            displayBallsForTeamB(ballsTeamB);
        }
    }


    public void displayOutFromTeamB(int out) {
        TextView outView = findViewById(R.id.team_b_out);
        outView.setText(String.valueOf(out));
    }

    // to count and display the total no. players from team B
    public void oneOutFromTeamB(View v) {
        if (outTeamB < 10 && ballsTeamB > 0) {
            outTeamB = outTeamB + 1;
            ballsTeamB = ballsTeamB - 1;

            displayOutFromTeamB(outTeamB);
            if (ballsTeamB == 0 && oversTeamB > 0) {
                oversTeamB = oversTeamB - 1;
                ballsTeamB = 6;
            }
            displayOversForTeamB(oversTeamB);
            displayBallsForTeamB(ballsTeamB);
        }
    }


    // For reset the score of team B
    public void resetScoreOfTeamB(View v) {
        scoreTeamB = 0;
        outTeamB = 0;
        oversTeamB = 9;
        ballsTeamB = 6;
        displayScoreForTeamB(scoreTeamB);
        displayOutFromTeamB(outTeamB);
        displayOversForTeamB(oversTeamB);
        displayBallsForTeamB(ballsTeamB);
    }

}

