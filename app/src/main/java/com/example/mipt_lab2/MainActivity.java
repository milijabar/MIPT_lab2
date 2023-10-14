package com.example.mipt_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edUserInput;
    Button btnCount;
    TextView tvMain;
    Spinner spSelectionOptions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edUserInput = findViewById(R.id.edUserInput);
        this.btnCount = findViewById(R.id.btnCount);
        this.tvMain = findViewById(R.id.tvMain);

        this.spSelectionOptions = (Spinner) findViewById(R.id.spSelectionOptions);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.selection_options,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelectionOptions.setAdapter(adapter);
    }

    public void onBtnCountClick(View view) {
        if (this.spSelectionOptions.getSelectedItem().toString().equalsIgnoreCase("Symbols")) {
            int result = TextCounter.countSymbols(this.edUserInput.getText().toString());
            Log.i("CountResult", String.valueOf(result));
            this.tvMain.setText(String.valueOf(result));
        } else {
            int result = TextCounter.countWords(this.edUserInput.getText().toString());
            this.tvMain.setText(String.valueOf(result));
            //Toast.makeText(this, "Not implemented", Toast.LENGTH_LONG).show();
        }
    }

}