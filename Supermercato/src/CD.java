public class CD extends Prodotto {

    private String autore;
    private String esecutore;
    private double durata;
    public CD(String codice, String titolo, String descrizione, String anno, double prezzo, int quantità, String autore, String esecutore, double durata) {
        super(codice, titolo, descrizione, anno, prezzo, quantità);
        this.autore = autore;
        this.esecutore = esecutore;
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEsecutore() {
        return esecutore;
    }

    public void setEsecutore(String esecutore) {
        this.esecutore = esecutore;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }
}
