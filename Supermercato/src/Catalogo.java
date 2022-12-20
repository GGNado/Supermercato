public class Catalogo {

    private Prodotto[] prodotti;
    public Catalogo(){
        prodotti = new Prodotto[99];
    }

    /*Aggiungo un prodotto nel catalogo nella prima occorrenza vuota, altrimenti catalogo vuoto*/
    public void aggiungiProdotto(Prodotto prodotto){
        for (int i = 0; i < 99; i++) {
            if (prodotti[i] == null){
                prodotti[i] = prodotto;
                return;
            }
        }
        System.out.println("Il catalogo è pieno");
    }

    /*Elimino un prodotto passando l'oggetto*/
    public void eliminaProdotto(Prodotto prodotto){
        int x = cercaProdotto(prodotto);

        if (x == -1){
            System.out.println("Il prodotto non è stato trovato all'interno del catalogo");
            return;
        }

        prodotti[x] = null;
    }

    /*Elimino il prodotto passando il codice*/
    public void eliminaProdotto(String str){
        int x = cercaProdotto(str);

        if (x == -1){
            System.out.println("Il codice del prodotto non è stato trovato all'interno del catalogo");
            return;
        }

        prodotti[x] = null;
    }
    /*Cerco il prodotto passando l'oggetto*/
    public int cercaProdotto(Prodotto prodotto){
        for (int i = 0; i < 99; i++) {
            if (prodotti[i] == prodotto)
                return i;
        }

        return -1;
    }
    /*Cerco il prodotto passando il codice*/
    public int cercaProdotto(String str){
        for (int i = 0; i < 99; i++) {
            if (prodotti[i] != null)
                if (prodotti[i].getCodice().equals(str))
                    return i;
        }

        return -1;
    }
    /*Elenco i prodotti */
    public void elencaProdotto(){
        System.out.println("\n- - - - - CATALOGO - - - - -\n");
        for (int i = 0; i < 99; i++) {
            if (prodotti[i] != null)
                System.out.println("Codice: " + prodotti[i].getCodice() + " Titolo:" + prodotti[i].getTitolo() + " Prezzo: £" + prodotti[i].getPrezzo() + " Quantità:" + prodotti[i].getQuantità());
        }
        System.out.println("\n- - - - - FINE CATALOGO - - - - -\n");

    }

    /*Restituisco un prodotto (Funzione utilizzata dal Carrello)*/
    public Prodotto getProdotto(String str){
        int x = cercaProdotto(str);

        if (x != -1) return prodotti[x];

        return null;

    }

}
