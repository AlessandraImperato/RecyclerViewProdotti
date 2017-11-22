package it.alessandra.recyclerviewprodotti;

import android.content.Intent;
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

        //Intent i3 = getIntent();
    }

    public List<Prodotto> init(){
        List<Prodotto> elenco = new ArrayList<>();

        Prodotto p1 = new Prodotto(1,"Mozzarella",2.50, "25/11/2017");
        Prodotto p2 = new Prodotto(2,"Pizza surgelata",3.50,"25/12/2017");
        Prodotto p3 = new Prodotto(3,"Zucchine",1.50,"30/11/2017");
        Prodotto p4 = new Prodotto(4,"Yogurt",1.90, "2/12/2017");
        Prodotto p5 = new Prodotto(5,"Budino",0.90, "7/12/2017");
        Prodotto p6 = new Prodotto(6,"Cioccolata",2.90, "31/03/2018");
        Prodotto p7 = new Prodotto(7,"Grissini",1.90, "2/2/2018");

        elenco.add(p1);
        elenco.add(p2);
        elenco.add(p3);
        elenco.add(p4);
        elenco.add(p5);
        elenco.add(p6);
        elenco.add(p7);

        return  elenco;
    }
}
