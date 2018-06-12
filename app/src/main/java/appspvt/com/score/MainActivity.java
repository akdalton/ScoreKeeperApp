package appspvt.com.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cricketActivity(View view) {
        Intent intent = new Intent(this, CricketActivity.class);
        startActivity(intent);
    }

    public void footballActivity(View view) {
        Intent intent = new Intent(this, FootballActivity.class);
        startActivity(intent);
    }
}
