package Exercicio02;

import java.util.Objects;

public class Aluno {
    private int rm;
    private String nome;
    private String curso;

    public Aluno(int rm, String nome, String curso) {
        this.rm = rm;
        this.nome = nome;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return String.format("RM = %d | Nome= %s | Curso = %s", rm, nome, curso);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Aluno aluno)) return false;
        return rm == aluno.rm;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rm);
    }
}
