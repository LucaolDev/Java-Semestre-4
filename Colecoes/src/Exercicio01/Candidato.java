package Exercicio01;

public class Candidato {

    private String nome;
    private double notaTecinica;
    private int anosExperience;

    public Candidato(String nome, double notaTecinica, int anosExperience) {
        this.nome = nome;
        this.notaTecinica = notaTecinica;
        this.anosExperience = anosExperience;
    }

    @Override
    public String toString() {
        return String.format("Nome = %s | Nota técnica = %.2f | Anos = %d", nome, notaTecinica, anosExperience);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaTecinica() {
        return notaTecinica;
    }

    public void setNotaTecinica(double notaTecinica) {
        this.notaTecinica = notaTecinica;
    }

    public int getAnosExperience() {
        return anosExperience;
    }

    public void setAnosExperience(int anosExperience) {
        this.anosExperience = anosExperience;
    }
}
