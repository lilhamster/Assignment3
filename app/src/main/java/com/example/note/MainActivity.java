package com.example.note;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    public int count = 0;
    Button btnSave;
    EditText notetxt;
    LinearLayout saved, original;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notetxt = findViewById(R.id.noteTxt);
        btnSave = findViewById(R.id.Save);
        saved = findViewById(R.id.linearLayout2);
        original = findViewById(R.id.linearLayout);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                EditText et = new EditText(MainActivity.super.getBaseContext());
                LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                et.setLayoutParams(p);
                et.setText(notetxt.getText());
                et.setId(count + 1);
                et.setImeOptions(EditorInfo.IME_ACTION_DONE);
                saved.addView(et);
                count++;
            }
        });

    }
}