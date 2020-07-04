package org.libreapps.yourtrad;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText emailEditTxt = (EditText) findViewById(R.id.username);
        final EditText passwordEditTxt = (EditText) findViewById(R.id.password);

        Button buttonOk = (Button) findViewById(R.id.buttonValidate);

        buttonOk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, LanguageChoice.class);
                startActivity(intent);
            }
        });

    }
}
