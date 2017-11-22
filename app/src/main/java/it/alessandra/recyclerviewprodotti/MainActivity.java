package it.alessandra.recyclerviewprodotti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    private List<Prodotto> prodotti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prodotti = init();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        final MyAdapter myAdapter = new MyAdapter(prodotti,getApplicationContext());
        recyclerView.setAdapter(myAdapter);

    }

    public List<Prodotto> init(){
        List<Prodotto> elenco = new ArrayList<>();

        Prodotto p1 = new Prodotto("Mozzarella",2.50);
        Prodotto p2 = new Prodotto("Pizza surgelata",3.50);
        Prodotto p3 = new Prodotto("Zucchine",1.50);
        Prodotto p4 = new Prodotto("Yogurt",1.90);

        elenco.add(p1);
        elenco.add(p2);
        elenco.add(p3);
        elenco.add(p4);

        return  elenco;
    }
}
