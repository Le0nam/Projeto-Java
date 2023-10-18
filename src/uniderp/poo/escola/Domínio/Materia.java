package uniderp.poo.escola.Domínio;

public class Materia extends BaseIdentificador{
    public String conteudo;
    public Professor professor;
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Materia(int codigo, String conteudo, Professor professor) {
        super(codigo);
        this.conteudo = conteudo;
        this.professor = professor;
    }
}