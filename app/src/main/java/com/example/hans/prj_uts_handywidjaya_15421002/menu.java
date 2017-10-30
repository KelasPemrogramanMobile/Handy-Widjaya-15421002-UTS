package com.example.hans.prj_uts_handywidjaya_15421002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class menu extends AppCompatActivity {

    private EditText edNama,edNpm,edTtl,edAgama,edFakultas,edProdi;
    private Button btnGetData;
    String nama,npm,ttl,agama,fakultas,prodi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        edNama = (EditText) findViewById(R.id.isiNama);
        edNpm = (EditText) findViewById(R.id.isiNpm);
        edTtl = (EditText) findViewById(R.id.isiTtl);
        edAgama = (EditText) findViewById(R.id.isiAgama);
        edFakultas = (EditText) findViewById(R.id.isiFakultas);
        edProdi = (EditText) findViewById(R.id.isiProdi);
        btnGetData = (Button) findViewById(R.id.btnambildata);

        btnGetData.setOnClickListener(new View.OnClickListener() {

            EditText xUTS, xUAS, xNA, xNH;
            int nuts, nuas, nkuis, ntugas;
            String xnh;
            double hasil;

            @Override
            public void onClick(View view) {
                nama = edNama.getText().toString();
                npm = edNpm.getText().toString();
                ttl = edTtl.getText().toString();
                agama = edAgama.getText().toString();
                fakultas = edFakultas.getText().toString();
                prodi = edProdi.getText().toString();


                Intent go = new Intent(menu.this, nilai.class);
                go.putExtra("Nama", nama);
                go.putExtra("Npm", npm);
                go.putExtra("Ttl", ttl);
                go.putExtra("Agama", agama);
                go.putExtra("Fakultas", fakultas);
                go.putExtra("Prodi", prodi);
                startActivity(go);

                finish();

                nuts = Integer.parseInt(edFakultas.getText().toString());
                nuas = Integer.parseInt(edProdi.getText().toString());
                nkuis = Integer.parseInt(edAgama.getText().toString());
                ntugas = Integer.parseInt(edTtl.getText().toString());
                hasil = (0.15 * ntugas) + (0.20 * nkuis) + (0.30 * nuts) + (0.35 * nuas);

                xNA.setText(hasil + "");

                if (hasil >= 85 && hasil <= 100) xnh = "A";
                else if (hasil >= 75 && hasil <= 85) xnh = "B";
                else if (hasil >= 65 && hasil <= 75) xnh = "C";
                else if (hasil >= 50 && hasil <= 65) xnh = "D";
                else if (hasil >= 50 && hasil <= 0) xnh = "E";
                xNH.setText(xnh);
            }

        });

    }

}

