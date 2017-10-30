package com.example.hans.prj_uts_handywidjaya_15421002;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button btngetData;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.isiUsername);
        password = (EditText) findViewById(R.id.isiPassword);
        btngetData = (Button) findViewById(R.id.btnambildata);


        btngetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = username.getText().toString();
                pass = password.getText().toString();

                login();
            }

            public void login() {
                btngetData.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("hanhan") && password.getText().toString().equals("apaajadah")) {
                            Toast.makeText(MainActivity.this, "Login Anda Sukses", Toast.LENGTH_LONG).show();
                            Intent go = new Intent(MainActivity.this, menu.class);
                            go.putExtra("Nama", user);
                            startActivity(go);

                        } else {
                            Toast.makeText(MainActivity.this, "Login anda gagal coyy, periksa kembali username dan password anda", Toast.LENGTH_LONG).show();

                            finish();
                        }
                    }
                });
            }
        });
    };
}
