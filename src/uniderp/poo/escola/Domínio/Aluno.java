package uniderp.poo.escola.Domínio;

import java.time.LocalDate;

public class Aluno extends BasePessoa {

    private int periodo;

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Aluno(int codigo, String nome, String nomeUsuario, String senha, LocalDate dataNascimento, int periodo) {
        super(codigo, nome, dataNascimento, nomeUsuario, senha);
        this.periodo = periodo;
    }
}
