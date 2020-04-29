package com.example.themartialartsschool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.Nullable;

public class TechniqueScoreCriteriaOne extends Activity {

    EditText editText1, editText2, editText3, editText4, editText5, editText6;
    int e1, e2, e3, e4, e5, e6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.technique_score_criteria_one);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);

    }

    public void nextCriteria(View view) {
        int e1 = Integer.parseInt(editText1.getText().toString());
        if( e1 <1 && e1 >5) {
            editText1.setError( "Provide score between 1 to 5" );
            return;
        }
        int e2 = Integer.parseInt(editText2.getText().toString());
//        if( e2 <1 && e2 >5) {
//            editText1.setError( "Provide score between 1 to 5" );
//            return;
//        }
        int e3 = Integer.parseInt(editText3.getText().toString());
//        if( e3 <1 && e3 >5) {
//            editText1.setError( "Provide score between 1 to 5" );
//            return;
//        }
        int e4 = Integer.parseInt(editText4.getText().toString());
//        if( e4 <1 && e4 >5) {
//            editText1.setError( "Provide score between 1 to 5" );
//            return;
//        }
        int e5 = Integer.parseInt(editText5.getText().toString());
//        if( e5 <1 && e5 >5) {
//            editText1.setError( "Provide score between 1 to 5" );
//            return;
//        }
        int e6 = Integer.parseInt(editText6.getText().toString());
//        if( e6 <1 && e6 >5) {
//            editText1.setError( "Provide score between 1 to 5" );
//            return;
//        }

        int sum = e1 + e2 + e3 + e4 + e5 + e6;

        Intent iOne = new Intent(this, TechniqueScoreCriteriaTwo.class);
        iOne.putExtra("sum", String.valueOf(sum));
        startActivity(iOne);
    }
}
