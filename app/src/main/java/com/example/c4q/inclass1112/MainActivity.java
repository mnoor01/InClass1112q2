package com.example.c4q.inclass1112;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;// first do the sharedpreferences stuff.
    public static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    private EditText userInputEditText;
    private Button matchButton;
    private Button submitButton;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInputEditText = (EditText) findViewById(R.id.userInput1);
        submitButton = (Button) findViewById(R.id.submitbutton);
        matchButton = (Button) findViewById(R.id.matchButton);
        sharedPreferences = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);
        editor = sharedPreferences.edit();


        matchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    public void saveFood(View view) {
        String input = userInputEditText.getText().toString();
        editor.putString(input, input);
        editor.apply();
    }
}
/*

 */