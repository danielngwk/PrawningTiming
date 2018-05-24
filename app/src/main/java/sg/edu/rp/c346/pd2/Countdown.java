package sg.edu.rp.c346.pd2;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Countdown extends AppCompatActivity {
    private TextView countdownText;
    private CountDownTimer countDownTimer;
    private long timeleftInMilliseconds = 10000;

//10800000
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        countdownText = (TextView) findViewById(R.id.textView);

        countDownTimer = new CountDownTimer(timeleftInMilliseconds, 1000) {
            @Override
            public void onTick(long l) {
                timeleftInMilliseconds = l;
                updateTimer();
            }

            @Override
            public void onFinish() {
                countdownText.setText("Please return the rod");
                MediaPlayer voice= MediaPlayer.create(Countdown.this,R.raw.voice);
                voice.start();
            }
        }.start();
    }

    public void updateTimer() {
        int minutes = (int) timeleftInMilliseconds / 60000;
        int seconds = (int) timeleftInMilliseconds % 60000 / 1000;

        String timeleft;

        timeleft = "" + minutes;
        timeleft += ":";
        if (seconds < 10) timeleft += "0";
        timeleft += seconds;
        countdownText.setText(timeleft);
    }
}
