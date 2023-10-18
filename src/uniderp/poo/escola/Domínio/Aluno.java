package uniderp.poo.escola.Domínio;

public class Aluno extends BaseIdentificador{
    
    protected String seila;

    public String getSeila() {
        return seila;
    }

    public void setSeila(String seila) {
        this.seila = seila;
    }

    public Aluno(int codigo, String seila) {
        super(codigo);
        this.seila = seila;
    }

}
