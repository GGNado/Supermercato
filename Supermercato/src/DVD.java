public class DVD extends Prodotto {
    private String regista;
    private String produttore;
    private double durata;
    public DVD(String codice, String titolo, String descrizione, String anno, double prezzo, int quantità, String regista, String produttore, double durata) {
        super(codice, titolo, descrizione, anno, prezzo, quantità);
        this.regista = regista;
        this.produttore = produttore;
        this.durata = durata;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }
}
