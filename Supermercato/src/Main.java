public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        DVD dvd = new DVD("1234", "Harry potter e il principe mezzo sangue", "Saga harry potter", "2009", 20.00, 1, "J.K. Rowling", "Warner Bros", 150);
        Libro libro = new Libro("6512", "Martin Eden", "Romantico", "1925", 11.50, 5, "Jack London", "Mondatori", 393);
        CD cd = new CD("7765", "Musica", "Music Metal", "1999", 5.00, 1, "Anonimo", "Anonimo", 120);
        Libro libro2 = new Libro("1111", "Martin Eden", "Romantico", "1925", 11.50, 5, "Jack London", "Mondatori", 393);

        catalogo.aggiungiProdotto(libro2);
        catalogo.aggiungiProdotto(cd);
        catalogo.aggiungiProdotto(dvd);
        catalogo.aggiungiProdotto(libro);

        catalogo.eliminaProdotto("1111");
        catalogo.elencaProdotto();
        int x = catalogo.cercaProdotto(dvd);
        if (x != -1) System.out.println("Prodotto trovato nella posizione " + (x+1) + " del catalogo");

        int y = catalogo.cercaProdotto("1234");
        if (y != -1) System.out.println("Prodotto trovato nella posizione " + (y+1) + " del catalogo");


        Carrello carrello = new Carrello();
        carrello.aggiungiProdottoCarrello(catalogo.getProdotto("1234"));
        carrello.aggiungiProdottoCarrello(catalogo.getProdotto("7765"));

        carrello.elencaProdotto();
        System.out.println("Il prezzo da pagare è: £" + carrello.calcolaProdotti());



    }
}