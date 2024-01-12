package it.epicode.es;

class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }

    public void esegui() {
        show();
    }
}
