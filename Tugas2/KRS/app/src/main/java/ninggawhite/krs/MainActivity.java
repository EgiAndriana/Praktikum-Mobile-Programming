package ninggawhite.krs;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_login;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login   = (Button) findViewById(R.id.btn_login);
        email       = (EditText) findViewById(R.id.email);
        password    = (EditText) findViewById(R.id.password);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG);
                    Intent loginsukses = new Intent(MainActivity.this, krs.class);
                    startActivity(loginsukses);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_LONG) .show();
                }
            }
        });
    }
}
