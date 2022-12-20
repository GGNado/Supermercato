public class Libro extends Prodotto {
    private String autore;
    private String editore;
    private int pagine;
    public Libro(String codice, String titolo, String descrizione, String anno, double prezzo, int quantità, String autore, String editore, int pagine) {
        super(codice, titolo, descrizione, anno, prezzo, quantità);
        this.autore = autore;
        this.editore = editore;
        this.pagine = pagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }
}
