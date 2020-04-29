package com.example.themartialartsschool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class ResultActivity extends Activity {

    TextView scoreShowTextView, degreeShowTextView;
    Button returnButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_result);

        scoreShowTextView = (TextView) findViewById(R.id.scoreShowTextView);
        degreeShowTextView = (TextView) findViewById(R.id.degreeShowTextView);
        returnButton = (Button) findViewById(R.id.returnButton);

        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            return;
        }
        String score = extras.getString("score");
        scoreShowTextView.setText(score);

        int tScore = Integer.parseInt(score);
        if(tScore <= 24) degreeShowTextView.setText("1st degree");
        else if(tScore >= 25 && tScore <=38) degreeShowTextView.setText("2nd degree");
        else if(tScore >= 39 && tScore <=59) degreeShowTextView.setText("2nd degree");
        else if(tScore >= 60) degreeShowTextView.setText("2nd degree");
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
