package com.example.themartialartsschool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class TechniqueScoreCriteriaTwo extends Activity {

    EditText editText7, editText8, editText9, editText10, editText11, editText12, editText13;
    String sum;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.technique_score_criteria_two);

        editText7 = (EditText) findViewById(R.id.editText7);
        editText8 = (EditText) findViewById(R.id.editText8);
        editText9 = (EditText) findViewById(R.id.editText9);
        editText10 = (EditText) findViewById(R.id.editText10);
        editText11 = (EditText) findViewById(R.id.editText11);
        editText12 = (EditText) findViewById(R.id.editText12);
        editText13 = (EditText) findViewById(R.id.editText13);


        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            return;
        }
        sum = extras.getString("sum");
    }

    public void openResult(View view) {
        int e7 = Integer.parseInt(editText7.getText().toString());
        int e8 = Integer.parseInt(editText8.getText().toString());
        int e9 = Integer.parseInt(editText9.getText().toString());
        int e10 = Integer.parseInt(editText10.getText().toString());
        int e11 = Integer.parseInt(editText11.getText().toString());
        int e12 = Integer.parseInt(editText12.getText().toString());
        int e13 = Integer.parseInt(editText13.getText().toString());

        int score = Integer.parseInt(sum) + e7 + e8 + e9 + e10 + e11 + e12 + e13;
        Intent iTwo = new Intent(this, ResultActivity.class);
        iTwo.putExtra("score", String.valueOf(score));
        startActivity(iTwo);
    }
}
