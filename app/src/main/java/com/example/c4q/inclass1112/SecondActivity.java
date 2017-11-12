package com.example.c4q.inclass1112;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by c4q on 11/12/17.
 */

public class SecondActivity extends AppCompatActivity {//For backward compatibility
    private EditText userGuess;
    private SharedPreferences sharedPreferences;
    @Override
    protected  void onCreate(Bundle onSavedInstanceState) {
        super.onCreate(onSavedInstanceState);
        setContentView(R.layout.activity_second);
        userGuess= (EditText) findViewById(R.id.userguess);

        sharedPreferences = getApplicationContext().getSharedPreferences(MainActivity.SHARED_PREFS_KEY,MODE_PRIVATE);

    }
    public void checkFood(View view) {
       String input= userGuess.getText().toString();
       if(sharedPreferences.contains(input)){
           Toast.makeText(getApplicationContext(),"great, youd did a good job",Toast.LENGTH_LONG).show();
       }
       else {
           Toast.makeText(getApplicationContext(),"Try again",Toast.LENGTH_LONG).show();
       }

    }
}
