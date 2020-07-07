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

        final EditText emailEditTxt = (EditText) findViewById(R.id.edittext_username);
        final EditText passwordEditTxt = (EditText) findViewById(R.id.edittxt_password);

        Button buttonLogin = (Button) findViewById(R.id.button_login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ConnectionRest connectionRest = new ConnectionRest();
                JSONObject user = new JSONObject();

                try {
                    user.put("email", emailEditTxt.getText().toString());
                    user.put("password", passwordEditTxt.getText().toString());

                    connectionRest.setJsonObj(user);


                    Intent intent = new Intent(LoginActivity.this, LanguageChoice.class);
                    startActivity(intent);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });

    }
}
