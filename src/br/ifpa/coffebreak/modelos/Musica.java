package br.ifpa.coffebreak.modelos;

public class Musica extends Midia {
    private String artista;
    private String album;
    private int anoDeLancamento;

    public Musica(String nome) {
        super(nome, duracaoEmSegundos = 0);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}
