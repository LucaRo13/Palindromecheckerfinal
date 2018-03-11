package com.example.luca.palindromechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String LOGTAG = "PalinApp";
    EditText txtInput;
    TextView txtOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOutput = (TextView) findViewById(R.id.tvOutput);
        txtInput = (EditText) findViewById(R.id.txtInput);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPalindrome();
            }
        });

    }

    private void checkPalindrome() {
        Log.d(LOGTAG, "check Palindrom");
        Toast.makeText(this, txtInput.getText().toString(), Toast.LENGTH_LONG).show();

        String inputTxt = txtInput.getText().toString().toLowerCase();



        if (inputTxt.length() > 4) {

            if (inputTxt.equals(new StringBuilder(inputTxt).reverse().toString())) {
                txtOutput.setText(inputTxt + " is a palindrome");
            } else {
                txtOutput.setText(inputTxt + " is no palindrome");
            }


        }else {
            txtOutput.setText("Enter Text > 4");
        }
    }
}
