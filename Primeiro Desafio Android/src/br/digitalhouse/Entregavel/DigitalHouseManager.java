package br.digitalhouse.Entregavel;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    List<Aluno> listadealunos = new ArrayList<>();
    List<Professor> listaprofessores = new ArrayList<>();
    List<Curso> listacursos = new ArrayList<>();
    List<Matricula> listamatriculas = new ArrayList<>();



    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos){
        Curso novoCurso = new Curso(nome,codigoCurso,quantidadeMaximaDeAlunos);
        listacursos.add(novoCurso);
        System.out.println(novoCurso.toString());
    }

    public void excluirCurso(Integer codigoCurso){
        listacursos.remove(codigoCurso);
        System.out.println("Curso excluido com sucesso Jessica :D " + codigoCurso + " Full Stack");
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessorAdjunto, Integer quantidadeDeHoras){
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto(nome,sobrenome,codigoProfessorAdjunto,quantidadeDeHoras);
        listaprofessores.add(novoProfessorAdjunto);
        System.out.println(novoProfessorAdjunto.toString());
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessorTitular, String especialidade){
        ProfessorTitular novoProfessorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessorTitular, especialidade);
        listaprofessores.add(novoProfessorTitular);
        System.out.println(novoProfessorTitular.toString());
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaprofessores.remove(codigoProfessor);
    }


    public void matricularAluno(String nome, String sobrenome,Integer codigoAluno){
        Aluno matriculandoAluno = new Aluno(nome,sobrenome,codigoAluno);
        listadealunos.add(matriculandoAluno);
        System.out.println("Aluno matriculado " + nome);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Curso curso = null;
        Aluno aluno = null;
        Matricula matricula;

        for (Curso matriculaCurso: listacursos) {
            if (matriculaCurso.getCodigoCurso().equals(codigoCurso)) {
                curso = matriculaCurso;
            }
        }
        for (Aluno matriculaNoAluno: listadealunos) {
            if(matriculaNoAluno.getCodigoAluno().equals(codigoAluno)){
                aluno = matriculaNoAluno;
            }
        }
        if(curso != null && aluno != null){
            if(curso.adicionarUmAluno(aluno)){
              matricula = new Matricula(aluno,curso);
              listamatriculas.add(matricula);
                System.out.println("Aluno matriculado com sucesso");
            } else if (aluno == null){
                System.out.println("Aluno não encontrado");
            } else if(curso == null){
                System.out.println("Curso não encontrado");
            }
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        ProfessorTitular profTitular = new ProfessorTitular(codigoProfessorTitular);
        ProfessorAdjunto profAdjunto = new ProfessorAdjunto(codigoProfessorAdjunto);
        Curso profCurso = new Curso(profTitular, profAdjunto);


        for (Professor professor : listaprofessores) {
            if(professor.getCodigoProfessor().equals(codigoProfessorTitular)){
                profTitular = (ProfessorTitular) professor;
            }
        }

        for (Professor professor : listaprofessores) {
            if(professor.getCodigoProfessor().equals(codigoProfessorAdjunto)){
                profAdjunto = (ProfessorAdjunto) professor;
            }
        }

        for (Curso curso : listacursos) {
             if(curso.getCodigoCurso().equals(codigoCurso)){
                 profCurso = (Curso) curso;
             }
        }
        if(profCurso != null){
            profCurso.setProfessorAdjunto(profAdjunto);
            profCurso.setProfessorTitular(profTitular);
            System.out.println("Professor alocado com sucesso");
        } else{
            System.out.println("Não foi possivel alocar o professor");
        }
        System.out.println(profCurso);

    }

}
