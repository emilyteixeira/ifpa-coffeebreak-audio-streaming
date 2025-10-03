package br.ifpa.coffeebreak.modelos;

import java.time.LocalDate;

public class Episodio extends Midia{
    private LocalDate data;
    private String convidado;
    int duracaoEmSegundos;

    public Episodio(String nome, LocalDate data, String convidado) {
        super(nome, duracaoEmSegundos=0);
        this.data = data;
        this.convidado = convidado;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
