package uniderp.poo.escola.Domínio;

import java.util.ArrayList;

public class Trabalho extends BaseIdentificador {
    private int codigoDisciplina;
    private String descricao;
    private ArrayList<Disciplina> disciplina;

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public Trabalho(int codigo, int codigoDisciplina, String descricao, ArrayList<Disciplina> disciplina) {
        super(codigo);
        this.codigoDisciplina = codigoDisciplina;
        this.descricao = descricao;
        this.disciplina = disciplina;
    }

}
