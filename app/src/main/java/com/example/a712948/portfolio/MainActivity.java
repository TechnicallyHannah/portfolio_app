package com.example.a712948.portfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button[] = new Button[5];
        button[0] = (Button) findViewById(R.id.movies);
        button[1] = (Button) findViewById(R.id.super_duo);
        button[2] = (Button) findViewById(R.id.build_it_bigger);
        button[3] = (Button) findViewById(R.id.xyzreader);
        button[4] = (Button) findViewById(R.id.capstone);

        for (int i = 0; i < (button.length); i++) {
            button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "Coming soon " + ((Button) view).getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
