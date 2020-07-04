package org.libreapps.yourtrad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TraductionChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduction_choice);

        final EditText emailEditTxt = (EditText) findViewById(R.id.username);
        final EditText passwordEditTxt = (EditText) findViewById(R.id.password);

        Button buttonOk = (Button) findViewById(R.id.login);

        /*
        buttonOk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TraductionChoiceActivity.this, LanguageChoice.class);
                startActivity(intent);
            }
        });
        */
    }
}
