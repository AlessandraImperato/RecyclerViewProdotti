package it.alessandra.recyclerviewprodotti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrezzoActivity extends AppCompatActivity {

    private Button ok;
    private EditText newPrezzo;
    private TextView intro;
    private Intent i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prezzo);

        ok = findViewById(R.id.ok);
        newPrezzo = findViewById(R.id.prezzonew);
        intro = findViewById(R.id.intro);

        i2 = getIntent();
        Double prz = Double.parseDouble(i2.getSerializableExtra("Prezzo").toString());


        /* prendo il nuovo prezzo che viene inserito e lo salvo in prezzo nuovo*/
        String tmp = newPrezzo.getText().toString();
        double prezzonuovo = Double.parseDouble(tmp);

    }
}
