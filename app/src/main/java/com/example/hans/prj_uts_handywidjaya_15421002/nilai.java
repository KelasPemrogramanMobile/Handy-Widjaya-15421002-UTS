package com.example.hans.prj_uts_handywidjaya_15421002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nilai extends AppCompatActivity {

    TextView textNama, textNpm, textAkhir, textGrade, textKeterangan;
    Intent nama, npm, Akhir, Grade, Keterangan;
    String strNama, strNpm, strAkhir, strGrade, strKeterangan;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);

        textNama = (TextView) findViewById(R.id.textNama);
        textNpm = (TextView) findViewById(R.id.textNpm);
        textAkhir = (TextView) findViewById(R.id.nilaiAkhir);
        textGrade = (TextView) findViewById(R.id.textGrade);
        textKeterangan = (TextView) findViewById(R.id.textKeterangan);

        btnback = (Button) findViewById(R.id.kembali);

        nama = getIntent();
        strNama = nama.getStringExtra("Nama");
        textNama.setText(strNama);

        npm = getIntent();
        strNpm = npm.getStringExtra("Npm");
        textNpm.setText(strNpm);

        Akhir = getIntent();
        strAkhir = Akhir.getStringExtra("Ttl");
        textAkhir.setText(strAkhir);

        Grade = getIntent();
        strGrade = Grade.getStringExtra("Agama");
        textGrade.setText(strGrade);

        Keterangan = getIntent();
        strKeterangan = Keterangan.getStringExtra("Fakultas");
        textKeterangan.setText(strKeterangan);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(nilai.this, MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });


    }
}




