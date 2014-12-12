package com.example.extsimionescu.mytrainertracker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    Button bCreateSet;

    EditText etExerciseOneName;
    EditText etExerciseTwoName;
    EditText etExerciseThreeName;

    EditText etTargetRepetitionsExerciseOne;
    EditText etTargetRepetitionsExerciseTwo;
    EditText etTargetRepetitionsExerciseThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bCreateSet = (Button)findViewById(R.id.bCreateSet);
        etExerciseOneName   = (EditText)findViewById(R.id.etExerciseOneName);
        etExerciseTwoName   = (EditText)findViewById(R.id.etExerciseTwoName);
        etExerciseThreeName   = (EditText)findViewById(R.id.etExerciseThreeName);

        etTargetRepetitionsExerciseOne   = (EditText)findViewById(R.id.etTargetRepetitionsExerciseOne);
        etTargetRepetitionsExerciseTwo   = (EditText)findViewById(R.id.etTargetRepetitionsExerciseTwo);
        etTargetRepetitionsExerciseThree   = (EditText)findViewById(R.id.etTargetRepetitionsExerciseThree);

        bCreateSet.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView myTextView =
                                (TextView)findViewById(R.id.status);
                        myTextView.setText("Button clicked" + etExerciseOneName.getText());
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
