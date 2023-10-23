import java.util.ArrayList;
import java.util.List;

import uniderp.poo.escola.Domínio.*;
//import uniderp.poo.escola.Repositorio.AlunoRepositorio;
//import uniderp.poo.escola.repositorio.AlunoRepositorio;
//import uniderp.poo.escola.Servico.AlunoServico;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> lista;
        lista = new ArrayList<String>();
        System.out.println("tamanho: " + lista.size());

        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");
        System.out.println("tamanho: " + lista.size());

        String ret = lista.get(2);
        System.out.println("elem[3]: " + ret);
        lista.add(2, "novo");
        System.out.println(lista);

        System.out.println("### Final de Execução. ###");
    }
}

// List<Aluno> alunos = new ArrayList<Aluno>();

// Aluno aluno = new Aluno(0, null, null, null, null, 0);
// aluno.setCodigo(21);
// alunos.add(aluno);

// System.out.println(aluno.getCodigo());