package br.digitalhouse.Entregavel;

import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;

    }

    @Override
    public String toString() {
        return "Matricula{" +
                "aluno=" + aluno +
                ", curso=" + curso +
                '}';
    }

    Date dataDoDia = new Date();

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
