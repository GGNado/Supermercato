public class Carrello {
    private Prodotto[] prodotti;

    public Carrello(){
        prodotti = new Prodotto[99];
    }

    public void aggiungiProdottoCarrello(Prodotto prodotto){

        if (prodotto == null){
            System.out.println("Prodotto non presente all'interno del catalogo");
            return;
        }
        for (int i = 0; i < 99; i++) {
            if (prodotti[i] == null){
                prodotti[i] = prodotto;
                return;
            }
        }
        System.out.println("Carrello pieno");
    }

    public void eliminaProdottoCarrello(Prodotto prodotto){
        for (int i = 0; i < 99; i++) {
            if (prodotti[i] == prodotto) {
                prodotti[i] = null;
                System.out.println("Prodotto eliminato");
                return;
            }
        }

        System.out.println("Prodotto non presente all'interno del Carrello");
    }

    public void eliminaProdottoCarrello(String str){
        for (int i = 0; i < 99; i++) {
            if (prodotti[i].getCodice() == str) {
                prodotti[i] = null;
                System.out.println("Prodotto eliminato");
                return;
            }
        }
        System.out.println("Prodotto non presente all'interno del Carrello");
    }

    public void elencaProdotto(){
        System.out.println("\n- - - - - CARRELLO - - - - -\n");
        for (int i = 0; i < 99; i++) {
            if (prodotti[i] != null)
                System.out.println("Codice: " + prodotti[i].getCodice() + " Titolo: " + prodotti[i].getTitolo() + " Prezzo: " + prodotti[i].getPrezzo() + " Quantità:" + prodotti[i].getQuantità());
        }
        System.out.println("\n- - - - - FINE CARRELLO - - - - -\n");
    }

    public double calcolaProdotti(){
        double prezzoTot = 0.00;
        for (Prodotto prodotto : prodotti){
            if (prodotto != null)
                prezzoTot += prodotto.getQuantità() * prodotto.getPrezzo();
        }

        return prezzoTot;
    }

}
