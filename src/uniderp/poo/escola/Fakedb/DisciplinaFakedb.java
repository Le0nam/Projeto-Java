package uniderp.poo.escola.Fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.Domínio.Aluno;
import uniderp.poo.escola.Domínio.Disciplina;

public class DisciplinaFakedb extends BaseFakedb<Disciplina> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Disciplina(0, null, null));
    }

    public DisciplinaFakedb() {
        super();
    }
}