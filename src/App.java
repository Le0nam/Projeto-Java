import uniderp.poo.escola.Domínio.Aluno;
import uniderp.poo.escola.Repositorio.AlunoRepositorio;
// import uniderp.poo.escola.repositorio.AlunoRepositorio;
import uniderp.poo.escola.Servico.AlunoServico;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("### Início de Execução. ###");

        //if(){}
        Aluno al = new Aluno(0, "null");

        Aluno ali = new Aluno(0, "null");
        Aluno alf= new Aluno(0, "null");
        Aluno aljd = new Aluno(0, "null");
        Aluno aldj = new Aluno(0, "null");
        Aluno ald= new Aluno(0, "null");

        // AlunoServico serv = new AlunoServico();
        // for (Aluno aluno : serv.Listar()) {
        //     System.out.println("-----------------------------------");
        //     aluno.Imprimir();
        // }

        System.out.println("### Final de Execução. ###");        
    }
}
