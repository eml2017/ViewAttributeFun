package com.example.viewattributefun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button onOffButton = (Button) findViewById(R.id.onOffButton);
        onOffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String currText = onOffButton.getText().toString();
                String onString = getString(R.string.on);
                String offString = getString(R.string.off);
                if (currText.compareTo(onString) == 0) {
                    onOffButton.setText(offString);
                }
                else {
                    onOffButton.setText(onString);
                }
            }
        });
    }
}
