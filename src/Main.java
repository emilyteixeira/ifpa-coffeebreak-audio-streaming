import br.ifpa.coffeebreak.modelos.Episodio;
import br.ifpa.coffeebreak.modelos.Musica;
import br.ifpa.coffeebreak.modelos.Podcast;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação do 1º Objeto → Instância da classe Música
        Musica musicaPreferida = new Musica("The Show Must Go On");
        // musicaPreferida.setNome("The Show Must Go On");
        musicaPreferida.setArtista("Queen");
        musicaPreferida.setAnoDeLancamento(1991);
        musicaPreferida.setDuracaoEmSegundos(281);
        musicaPreferida.exibeFichaTecnica();
        musicaPreferida.avalia(8); // Nota da Aylla
        musicaPreferida.avalia(7); // Nota do Chardival
        musicaPreferida.avalia(9); // Nota da Marcilene
        musicaPreferida.mediaNotas();

        System.out.println("A soma das notas é: "+musicaPreferida.getSomaNotas());
        System.out.println("A quantidade de avaliações foi: "+musicaPreferida.getTotalNotas());
        System.out.println("A média das notas é: "+musicaPreferida.mediaNotas());

        // Criação do 2º Objeto → Instância da classe Música
        Musica musicaPop = new Musica("Beat It");
        // musicaPop.setNome("Beat It");
        musicaPop.setArtista("Michael Jackson");
        musicaPop.avalia(10); // Nota da Vanessa
        musicaPop.exibeFichaTecnica();

        // Criação do 3º Objeto → Instância da classe Podcast
        Podcast cienciaSemFim = new Podcast("Ciência Sem Fim", 3000);
        // cienciaSemFim.setNome("Ciência Sem Fim"); // herda de mídia
        cienciaSemFim.setApresentador1("Sergio Sacani");
        //cienciaSemFim.setEpisodio("Resenha com Davi Calazans");
        Episodio ep1 = new Episodio("Resenha com Davi Calazans", LocalDate.of(2023,1, 23), "Davi Calazans");
        Episodio ep2 = new Episodio("A lua e os planetas", LocalDate.of(2025,2,3), "João de Caldas");
        System.out.println("O PodCast é: " +cienciaSemFim.getNome());
        cienciaSemFim.adicionaEpisodio(ep1);
        cienciaSemFim.adicionaEpisodio(ep2);
        cienciaSemFim.listarEpisodios();
        System.out.println("O PodCast tem duração de: " +cienciaSemFim.getDuracaoEmSegundos()+ " segundos.");
        System.out.println("O PodCast tem duração de: " +cienciaSemFim.getDuracaoEmSegundos()/60+ " minutos.");
        System.out.println("O PodCast tem duração de: " +cienciaSemFim.getDuracaoEmSegundos()/3600+ " horas.");

        // Criação do 4º Objeto → Instância da classe Podcast
        Podcast tecnopoliticaConjuntura = new Podcast("Tecnopolítica Conjuntura", 4500);
        tecnopoliticaConjuntura.setApresentador1("Sérgio Amadeu da Silveira");
        Episodio ep3 = new Episodio("Tecnologia e Democracia", LocalDate.of
(2024,5,15), "Marina Silva");
        tecnopoliticaConjuntura.adicionaEpisodio(ep3);
        tecnopoliticaConjuntura.listarEpisodios();


    }
}
