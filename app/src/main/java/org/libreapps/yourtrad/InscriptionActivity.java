package org.libreapps.yourtrad;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

public class InscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        final EditText firstNameEditText = (EditText) findViewById(R.id.edittext_firstname);
        final EditText lastNameEditText = (EditText) findViewById(R.id.edittext_lastname);
        final EditText emailEditText = (EditText) findViewById(R.id.edittext_email);
        final EditText passwordEditText = (EditText) findViewById(R.id.edittext_password);

        Button buttonValidate = (Button) findViewById(R.id.button_validate);

        buttonValidate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {

                    ConnectionRest connectionRest = new ConnectionRest();
                    JSONObject user = new JSONObject();
                    user.put("nom", lastNameEditText.getText().toString());
                    user.put("prenom", firstNameEditText.getText().toString());
                    user.put("email", emailEditText.getText().toString());
                    user.put("password", passwordEditText.getText().toString());
                    connectionRest.setJsonObj(user);
                    connectionRest.execute("POST");


                    Intent intent = new Intent(InscriptionActivity.this, LoginActivity.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
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