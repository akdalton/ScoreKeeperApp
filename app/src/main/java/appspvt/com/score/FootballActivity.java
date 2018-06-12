package appspvt.com.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class FootballActivity extends AppCompatActivity {

    int pointForTeamA = 0;
    int pointForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        displayPointForTeamA(0);
        displayPointForTeamB(0);
    }

    public void displayPointForTeamA(int points) {
        TextView pointView = findViewById(R.id.team_a_points);
        pointView.setText(String.valueOf(points));
    }

    public void addThreeForTeamA(View v) {
        pointForTeamA = pointForTeamA + 3;
        displayPointForTeamA(pointForTeamA);

    }

    public void addTwoForTeamA(View v) {
        pointForTeamA = pointForTeamA + 2;
        displayPointForTeamA(pointForTeamA);

    }

    public void addOneForTeamA(View v) {
        pointForTeamA = pointForTeamA + 1;
        displayPointForTeamA(pointForTeamA);

    }


    public void resetPointOfTeamA(View v) {
        pointForTeamA = 0;
        displayPointForTeamA(pointForTeamA);
    }


    public void displayPointForTeamB(int points) {
        TextView pointView = findViewById(R.id.team_b_points);
        pointView.setText(String.valueOf(points));
    }

    public void addThreeForTeamB(View v) {
        pointForTeamB = pointForTeamB + 3;
        displayPointForTeamB(pointForTeamB);
    }

    public void addTwoForTeamB(View v) {
        pointForTeamB = pointForTeamB + 2;
        displayPointForTeamB(pointForTeamB);
    }

    public void addOneForTeamB(View v) {
        pointForTeamB = pointForTeamB + 1;
        displayPointForTeamB(pointForTeamB);
    }

    public void resetPointOfTeamB(View v) {
        pointForTeamB = 0;
        displayPointForTeamB(pointForTeamB);
    }

}
