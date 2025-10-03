package br.ifpa.coffebreak.modelos;

public class Midia {
    private String nome;
    private String genero;
    private int duracaoEmSegundos;
    private boolean incluidoNoPlano;
    private double nota; // nota da música pelo usuário
    private double somaNotas; // somatório de todas as notas que forem dadas a uma música
    private int totalNotas; // quantidade de pessoas que atribuiram notas a música
    private int classificacao; // vai pegar a média de avaliações e criar a classificação por estrelas

    public Midia(String nome, int duracaoEmSegundos) {
        this.nome = nome;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracaoEmSegundos() {
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }

    public int getTotalNotas() {
        return totalNotas;
    }

    public void setTotalNotas(int totalNotas) {
        this.totalNotas = totalNotas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    public void exibeFichaTecnica(){
        System.out.println("O título é: " +nome);
        System.out.println("A duração da faixa é: " +duracaoEmSegundos);
    }

    public void avalia(double nota){
        somaNotas += nota;
        totalNotas++;
    }

    public double mediaNotas(){
        return somaNotas/totalNotas;
    }
}
