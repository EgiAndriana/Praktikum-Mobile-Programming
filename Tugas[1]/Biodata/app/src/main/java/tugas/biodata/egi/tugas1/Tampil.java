package tugas.biodata.egi.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import tugas.biodata.egi.tugas1.R;


public class Tampil extends AppCompatActivity {
    TextView Tnama, Tnim, Temail, Tangkatan, Vnama, Vnim, Vemail, Vangkatan;
    String get_nama, get_nim, get_email, get_angkatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_main);

        Tnama = (TextView) findViewById(R.id.textViewNama);
        Tnim = (TextView) findViewById(R.id.textViewNim);
        Temail = (TextView) findViewById(R.id.textViewEmail);
        Tangkatan = (TextView) findViewById(R.id.textViewAngkatan);
        Vnama = (TextView) findViewById(R.id.tampilNama);
        Vemail = (TextView) findViewById(R.id.tampilEmail);
        Vnim= (TextView) findViewById(R.id.tampilNim);
        Vangkatan = (TextView) findViewById(R.id.tampilAngkatan);

        Bundle b = getIntent().getExtras();

        get_nama = b.getString("parse_nama");
        get_email = b.getString("parse_email");
        get_nim = b.getString("parse_nim");
        get_angkatan = b.getString("parse_angkatan");

        Vnama.setText(""+get_nama);
        Vemail.setText(""+get_email);
        Vnim.setText(""+get_nim);
        Vangkatan.setText(""+get_angkatan);

    }

}