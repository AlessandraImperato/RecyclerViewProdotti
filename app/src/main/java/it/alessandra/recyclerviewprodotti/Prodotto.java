package it.alessandra.recyclerviewprodotti;




import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by utente7.academy on 22/11/2017.
 */

public class Prodotto implements Serializable{

    private String nome;
    private double prezzo;
    private Calendar scadenza;

    public Prodotto(){
        this.nome = null;
        this.prezzo = 0.0;
        this.scadenza = new GregorianCalendar();
    }

    public Prodotto(String nome, double prezzo,Calendar scadenza){
        this.nome = nome;
        this.prezzo = prezzo;
        this.scadenza = scadenza;
    }
    public Prodotto(String nome, double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public Calendar getScadenza() {
        return scadenza;
    }

    public void setScadenza(Calendar scadenza) {
        this.scadenza = scadenza;
    }
}
