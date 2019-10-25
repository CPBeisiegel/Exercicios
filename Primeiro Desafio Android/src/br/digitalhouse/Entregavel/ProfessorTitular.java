package br.digitalhouse.Entregavel;

public class ProfessorTitular extends Professor {

    private String especialidade;


    public ProfessorTitular(Integer codigoProfessor) {
       setCodigoProfessor(codigoProfessor);
    }

    public ProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
       setNome(nome);
       setSobrenome(sobrenome);
       setCodigoProfessor(codigoProfessor);
        this.especialidade = especialidade;
    }

    public ProfessorTitular() {
    }

    @Override
    public String toString() {
        return "ProfessorTitular{" +
                "nome='" + getNome()+ '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", codigoProfessor=" + getCodigoProfessor() +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }



    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
