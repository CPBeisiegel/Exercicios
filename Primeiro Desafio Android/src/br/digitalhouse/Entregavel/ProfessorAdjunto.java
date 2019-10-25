package br.digitalhouse.Entregavel;

public class ProfessorAdjunto extends Professor {

    private Integer horasMonitoria;


    public ProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
        setCodigoProfessor(codigoProfessor);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public ProfessorAdjunto(Integer codigoProfessor) {
        setCodigoProfessor(codigoProfessor);
    }

    public ProfessorAdjunto() {
    }

    @Override
    public String toString() {
        return "ProfessorAdjunto{" +
                "nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome()+ '\'' +
                ", codigoProfessor=" + getCodigoProfessor()+
                ", horasMonitoria=" + horasMonitoria +
                '}';
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
