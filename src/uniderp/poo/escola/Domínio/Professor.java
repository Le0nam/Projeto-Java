package uniderp.poo.escola.Domínio;

import java.time.LocalDate;

public class Professor extends BaseIdentificador {

    public String usuario;
    public String senha;
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Professor(int codigo, String usuario, String senha) {
        super(codigo);
        this.usuario = usuario;
        this.senha = senha;
    }
}