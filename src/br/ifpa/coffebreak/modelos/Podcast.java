package br.ifpa.coffebreak.modelos;

import java.util.ArrayList;
import java.util.List;

public class Podcast extends Midia {
    private String apresentador1;
    private List<Episodio> episodios = new ArrayList<>();

    public Podcast(String nome, int duracaoEmSegundos) {
        super(nome, duracaoEmSegundos);
    }

    public String getApresentador1() {
        return apresentador1;
    }

    public void setApresentador1(String apresentador1) {
        this.apresentador1 = apresentador1;
    }

    public void adicionaEpisodio(Episodio episodio){
        if(episodio != null){
            this.episodios.add(episodio);
        }
    }

    public int listarEpisodios(){
        if(episodios.isEmpty()){
            System.out.println("Não existem episódios nesse PodCast!");
        } else {
            for (Episodio e : episodios){
                System.out.println("Título do episódio: " + e.getNome() +
                        ", Data: " + e.getData() +
                        ", Convidado: " + e.getConvidado());
            }
        }
    }
    public int getDuracaoEmSegundos(){
        return super.getDuracaoEmSegundos();
        int duracaoTotal = 0;
        for (Episodio e : episodios) {
            duracaoTotal += e.getDuracaoEmSegundos();
        }
        return duracaoTotal;
    }
}
