package uniderp.poo.escola.Fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.Domínio.Aluno;

public class AlunoFakedb extends BaseFakedb<Aluno> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Aluno>();

    }

    public AlunoFakedb() {
        super();
    }
}