package br.digitalhouse.Entregavel;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaAlunos;
     List<Aluno> listaAlunos = new ArrayList<>();

    public Curso() {
    }

    public Curso(ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto) {
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
    }

    public Curso(String nome, Integer codigoCurso, Integer quantidadeMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;

    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigoCurso=" + codigoCurso +
                ", professorTitular=" + professorTitular +
                ", professorAdjunto=" + professorAdjunto +
                ", quantidadeMaximaAlunos=" + quantidadeMaximaAlunos +
                ", listaAlunos=" + listaAlunos +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public Integer getQuantidadeMaximaAlunos() {
        return quantidadeMaximaAlunos;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }


    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public void setQuantidadeMaximaAlunos(Integer quantidadeMaximaAlunos) {
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos;
    }

    public boolean adicionarUmAluno(Aluno umAluno) {
        if(listaAlunos.size() <= quantidadeMaximaAlunos){
            listaAlunos.add(umAluno);
            System.out.println("Aluno adicionado");
            return true;
        } else{
            System.out.println("Turma lotada");
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        listaAlunos.remove(umAluno);
    }
}

