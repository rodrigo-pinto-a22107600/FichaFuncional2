public class Aluno {
    String nome;
    int nota;
    String nacionalidade;

    public Aluno(String nome, int nota, String nacionalidade) {
        this.nome = nome;
        this.nota = nota;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    Boolean estaAprovado(){
        return nota >= 10;
    }

    public Boolean ePortugues(){
        return nacionalidade.equals("Portuguesa");
    }
}
