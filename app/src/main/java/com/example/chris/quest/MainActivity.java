package com.example.chris.quest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button go_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go_button = (Button) findViewById(R.id.button);
        go_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserHome();

            }
        });
    }
    public void openUserHome(){
        Intent intent = new Intent(this, User_Home.class );
        startActivity(intent);
    }
}
