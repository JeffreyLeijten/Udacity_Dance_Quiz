package com.example.android.dancequizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Checks if the filled in answer are correct and shows the score in a toast
     */
    void submitAnswers(View view) {
        int points = 0;
        int maxPoints = 10;

        //Question 1
        if (((RadioButton) findViewById(R.id.answer_1_c_radio_button)).isChecked())
            points++;

        //Question 2
        if (((CheckBox) findViewById(R.id.answer_2_a_check_box)).isChecked())
            points++;
        if (((CheckBox) findViewById(R.id.answer_2_b_check_box)).isChecked())
            points--;
        if (((CheckBox) findViewById(R.id.answer_2_c_check_box)).isChecked())
            points++;
        if (((CheckBox) findViewById(R.id.answer_2_d_check_box)).isChecked())
            points--;

        //Question 3
        String submittedAnswer = ((EditText) findViewById(R.id.answer_3_text_field)).getText().toString();
        if (submittedAnswer.equalsIgnoreCase(getString(R.string.answer_3)))
            points++;

        //Question 4
        submittedAnswer = ((EditText) findViewById(R.id.answer_4_text_field)).getText().toString();
        if (submittedAnswer.equalsIgnoreCase(getString(R.string.answer_4)))
            points++;

        //Question 5
        if (((CheckBox) findViewById(R.id.answer_5_a_check_box)).isChecked())
            points--;
        if (((CheckBox) findViewById(R.id.answer_5_b_check_box)).isChecked())
            points++;
        if (((CheckBox) findViewById(R.id.answer_5_c_check_box)).isChecked())
            points--;
        if (((CheckBox) findViewById(R.id.answer_5_d_check_box)).isChecked())
            points--;
        if (((CheckBox) findViewById(R.id.answer_5_e_check_box)).isChecked())
            points++;

        //Question 6
        if (((RadioButton) findViewById(R.id.answer_6_d_radio_button)).isChecked())
            points++;

        //Question 7
        submittedAnswer = ((EditText) findViewById(R.id.answer_7_text_field)).getText().toString();
        if (submittedAnswer.equalsIgnoreCase(getString(R.string.answer_7)))
            points++;

        //Question 8
        if (((CheckBox) findViewById(R.id.answer_8_a_check_box)).isChecked())
            points--;
        if (((CheckBox) findViewById(R.id.answer_8_b_check_box)).isChecked())
            points++;
        if (((CheckBox) findViewById(R.id.answer_8_c_check_box)).isChecked())
            points--;
        if (((CheckBox) findViewById(R.id.answer_8_d_check_box)).isChecked())
            points--;

        points = Math.min(points, 0);
        Toast.makeText(this, "You scored " + points + " out of " + maxPoints + " points", Toast.LENGTH_SHORT).show();
    }
}
