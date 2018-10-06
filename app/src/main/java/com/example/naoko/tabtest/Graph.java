package com.example.naoko.tabtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Graph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        final EditText editText = (EditText) findViewById(R.id.editText);

        Button button3 = (Button) findViewById(R.id.button3);

        final TextView nameText = (TextView) findViewById(R.id.textView5);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                nameText.setText(editText.getText().toString());
            }
        });
    }

}


