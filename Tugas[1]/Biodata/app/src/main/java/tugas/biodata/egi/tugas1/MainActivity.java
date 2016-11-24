package tugas.biodata.egi.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import tugas.biodata.egi.tugas1.R;

public class MainActivity extends AppCompatActivity {

    EditText nama, nim, email, angkatan;
    String var_nama, var_nim, var_email, var_angkatan;
    Button tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         nama = (EditText) findViewById (R.id.editTextNama);
         nama.getText();
         nim = (EditText) findViewById (R.id.editTextNim);
         nim.getText();
         email = (EditText) findViewById (R.id.editTextEmail);
         email.getText();
         angkatan = (EditText) findViewById(R.id.editTextAngkatan);
         angkatan.getText();
         tampil = (Button) findViewById(R.id.buttonSimpan);


         tampil.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 var_nama = nama.getText().toString();
                 var_email = email.getText().toString();
                 var_nim = nim.getText().toString();
                 var_angkatan = angkatan.getText().toString();

                 Intent i = null;
                 i = new Intent(MainActivity.this,Tampil.class);
                 Bundle b = new Bundle();
                 b.putString("parse_nama", var_nama);
                 b.putString("parse_email", var_email);
                 b.putString("parse_nim", var_nim);
                 b.putString("parse_angkatan", var_angkatan);
                 i.putExtras(b);
                 startActivity(i);
             }
         });


    }
}

