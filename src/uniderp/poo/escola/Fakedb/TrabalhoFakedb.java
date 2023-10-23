package uniderp.poo.escola.Fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.Domínio.Aluno;
import uniderp.poo.escola.Domínio.Trabalho;

public class TrabalhoFakedb extends BaseFakedb<Trabalho> {

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Trabalho(0, 0, null, null));
        ;

    }

    public TrabalhoFakedb() {
        super();
    }
}