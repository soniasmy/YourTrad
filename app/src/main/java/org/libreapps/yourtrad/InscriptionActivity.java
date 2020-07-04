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

//import org.libreapps.yourtrad.ui.login.LoginActivity;

public class InscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        final EditText nameEditTxt = (EditText) findViewById(R.id.name);
        final EditText firstNameEditTxt = (EditText) findViewById(R.id.firstname);
        final EditText emailEditTxt = (EditText) findViewById(R.id.email);
        final EditText passwordEditTxt = (EditText) findViewById(R.id.password);

        Button buttonOk = (Button) findViewById(R.id.buttonValidate);
        /*
        buttonOk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    ConnectionRest connectionRest = new ConnectionRest();
                    JSONObject user = new JSONObject();
                    user.put("nom", nameEditTxt.getText().toString());
                    user.put("prenom", firstNameEditTxt.getText().toString());
                    user.put("email", emailEditTxt.getText().toString());
                    user.put("password", passwordEditTxt.getText().toString());
                    connectionRest.setJsonObj(user);

                    connectionRest.execute("POST");

                    Intent intent = new Intent(InscriptionActivity.this, LoginActivity.class);
                    startActivity(intent);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}