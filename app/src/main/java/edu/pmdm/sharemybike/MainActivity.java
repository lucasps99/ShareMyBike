package edu.pmdm.sharemybike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnlogin = findViewById(R.id.login_button);
        btnlogin.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start next activity (BikeActivity)
                Intent i = new Intent(getApplicationContext(), BikeActivity.class);
                startActivity(i);
            }
        });
    }
}