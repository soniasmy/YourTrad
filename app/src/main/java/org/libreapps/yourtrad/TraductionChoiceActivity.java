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

        final EditText emailEditText = (EditText) findViewById(R.id.edittext_email);
        final EditText passwordEditText = (EditText) findViewById(R.id.edittext_password);

        Button buttonLogin = (Button) findViewById(R.id.button_login);

        /*
        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TraductionChoiceActivity.this, LanguageChoice.class);
                startActivity(intent);
            }
        });
        */
    }
}
