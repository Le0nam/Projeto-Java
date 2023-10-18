package uniderp.poo.escola.Domínio;

import java.time.LocalDate;

public abstract class BaseIdentificador {
    protected int codigo;
    private LocalDate data;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public BaseIdentificador(int codigo) {
        this.codigo = codigo;
    }
}
