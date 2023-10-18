package uniderp.poo.escola.Domínio;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseNome{
    protected String nomeUsuario;
    protected String senha;
    protected LocalDate dataNascimento;

    
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public BasePessoa(int codigo, String nome, String nomeUsuario, String senha, LocalDate dataNascimento) {
        super(codigo, nome);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }
    

}