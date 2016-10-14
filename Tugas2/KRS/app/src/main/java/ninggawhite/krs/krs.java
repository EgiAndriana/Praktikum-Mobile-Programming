package ninggawhite.krs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class krs extends AppCompatActivity {

    Button submit;
    EditText nim, nama;
    String var_nim, var_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_krs);

        submit  = (Button) findViewById(R.id.btn_submit);
        nim     = (EditText) findViewById(R.id.edtNIM);
        nama    = (EditText) findViewById(R.id.edtNama);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var_nim  = nim.getText().toString();
                var_nama = nama.getText().toString();


                Intent i = null;
                i = new Intent(krs.this, hasil_krs.class);
                Bundle b = new Bundle();
                b.putString("parse_nim",var_nim);
                b.putString("parse_nama",var_nama);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}
