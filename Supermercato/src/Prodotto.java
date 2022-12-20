public class Prodotto {
    private String codice;
    private String titolo;
    private String descrizione;
    private String anno;
    private double prezzo;
    private int quantità;

    public Prodotto(String codice, String titolo, String descrizione, String anno, double prezzo, int quantità){
        this.codice = codice;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.anno = anno;
        this.prezzo = prezzo;
        this.quantità = quantità;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }
}
