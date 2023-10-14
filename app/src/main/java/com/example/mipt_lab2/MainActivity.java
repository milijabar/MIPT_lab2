package com.example.mipt_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edUserInput;
    Button btnCount;
    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edUserInput = findViewById(R.id.edUserInput);
        this.btnCount = findViewById(R.id.btnCount);
        this.tvMain = findViewById(R.id.tvMain);
    }

    public void onBtnCountClick(View view) {
        int result = TextCounter.countSymbols(this.edUserInput.getText().toString());
        Log.i("CountResult", String.valueOf(result));

        this.tvMain.setText(String.valueOf(result));
    }
}