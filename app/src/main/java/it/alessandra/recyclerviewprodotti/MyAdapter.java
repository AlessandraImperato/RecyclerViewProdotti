package it.alessandra.recyclerviewprodotti;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by utente7.academy on 22/11/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>  {

    private List<Prodotto> prodotti;
    public Context context;
    public static Prodotto prodotto;

    //costruttori della classe MyAdapter
    public MyAdapter(List<Prodotto> listaProd){
        prodotti = listaProd;
    }

    public MyAdapter(List<Prodotto> listaProd, Context mcontext){
        prodotti = listaProd;
        context = mcontext;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.riga, parent, false);

        ViewHolder vh = new ViewHolder(v,parent.getContext());
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Prodotto tmp=prodotti.get(position);
        holder.nome.setText(tmp.getNome());
        holder.prezzo.setText(""+tmp.getPrezzo());
        holder.scadenza.setText(""+tmp.getScadenza());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,PrezzoActivity.class);
                i.putExtra("POSITION", position);
                ((Activity)v.getContext()).startActivityForResult(i,100);
            }
        });
    }

    @Override
    public int getItemCount() {
        return prodotti.size();
    }

    //classe interna
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public CardView cardView;
        public TextView nome;
        public TextView prezzo;
        public TextView scadenza;

        //costruttore classe interna
        public ViewHolder(View v, final Context context){
            super(v);
            cardView = (CardView)itemView.findViewById(R.id.cardv);
            nome = (TextView) v.findViewById(R.id.nomearticolo);
            prezzo = (TextView) v.findViewById(R.id.prezzo);
            scadenza = (TextView) v.findViewById(R.id.data);
        }

    }
    public Context getContext() {
        return context;
    }

    public void setPriceAtPosition(int position,double price){
        prodotti.get(position).setPrezzo(price);
    }



}
