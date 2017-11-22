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
    private String scadenza;
    private int id;

    public Prodotto(){
        this.nome = null;
        this.prezzo = 0.0;
        this.scadenza = null;
        this.id = 0;
    }

    public Prodotto(int id, String nome, double prezzo, String scadenza){
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.scadenza = scadenza;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getScadenza() {
        return scadenza;
    }

    public void setScadenza(String scadenza) {
        this.scadenza = scadenza;
    }
}
