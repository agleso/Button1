package com.example.button1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mCrowsCounterButton;
    private int mCount = 0;
    private int mCount2 = 0;
    TextView mInfoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfoTextView = findViewById(R.id.textView);
        mCrowsCounterButton = findViewById(R.id.button_counter);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText("Я насчитал " + ++mCount + " ворон");

            }
        });
    }

    public void onClick(View view) {
        //TextView helloTextView = (TextView) findViewById(R.id.textView);
        //helloTextView.setText("Hello Kitty!");
        mInfoTextView.setText("Hello Kitty!");

    }

    public void onClickCat(View view) {
        mInfoTextView.setText("Я насчитал"+ ++mCount2 + " котов");
    }
}
