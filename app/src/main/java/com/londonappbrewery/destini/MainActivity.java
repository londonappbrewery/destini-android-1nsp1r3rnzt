package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button buttonBottom;
    private TextView storyTextView;
    private Button buttonTop;
    private String currentButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
       buttonBottom = (Button) findViewById(R.id.buttonBottom);
       storyTextView = (TextView) findViewById(R.id.storyTextView);
       buttonTop = (Button) findViewById(R.id.buttonTop);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentButton==null||currentButton=="T3"||currentButton=="T2")
                {
                    storyTextView.setText(R.string.T3_Story);
                    buttonBottom.setText(R.string.T3_Ans2);
                    buttonTop.setText(R.string.T3_Ans1);
                    currentButton="T3_NEXT";
                }
                else if(currentButton=="T3_NEXT")
                {
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);

                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            buttonBottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(null == currentButton)
                    {
                        storyTextView.setText(R.string.T2_Story);
                        buttonBottom.setText(R.string.T2_Ans2);
                        buttonTop.setText(R.string.T2_Ans1);
                        currentButton="T2";
                    }
                    else if(currentButton=="T2")
                    {
                        storyTextView.setText(R.string.T4_End);
                        buttonTop.setVisibility(View.INVISIBLE);
                        buttonBottom.setVisibility(View.INVISIBLE);

                    }
                    else if(currentButton=="T3_NEXT")
                    {
                        storyTextView.setText(R.string.T5_End);
                        buttonTop.setVisibility(View.INVISIBLE);
                        buttonBottom.setVisibility(View.INVISIBLE);

                    }
                }
            });

    }
}
