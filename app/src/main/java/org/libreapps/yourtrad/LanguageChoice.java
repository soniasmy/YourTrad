package org.libreapps.yourtrad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class LanguageChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_choice);

        Spinner spinnerTranslateFrom = findViewById(R.id.spinner_translate_from);
        Spinner spinnerTranslateTo = findViewById(R.id.spinner_translate_to);
        String[] items = new String[]{"Français", "Anglais", "Espagnol"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinnerTranslateFrom.setAdapter(adapter);
        spinnerTranslateTo.setAdapter(adapter);


        Button buttonValidate = (Button) findViewById(R.id.button_validate);
        buttonValidate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LanguageChoice.this, TraductionChoiceActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}