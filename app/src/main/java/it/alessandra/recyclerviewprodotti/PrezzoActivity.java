package it.alessandra.recyclerviewprodotti;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrezzoActivity extends AppCompatActivity {

    private Button ok;
    private EditText newPrezzo;
    private TextView intro;
    private Intent i2;
    private Double prz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prezzo);

        ok = findViewById(R.id.ok);
        newPrezzo = findViewById(R.id.prezzonew);
        intro = findViewById(R.id.intro);

        i2 = getIntent();
         prz = Double.parseDouble(i2.getSerializableExtra("Prezzo").toString());


        /* prendo il nuovo prezzo che viene inserito e lo salvo in prezzo nuovo*/

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = newPrezzo.getText().toString();
               // double prezzonuovo = Double.parseDouble(tmp);
                prz = Double.parseDouble(tmp);
                i2.putExtra("RESULT", prz);
                setResult(Activity.RESULT_OK,i2);
                finish();

            }
        });

    }
}
