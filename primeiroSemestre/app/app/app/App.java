package app;
import app.entidade.Pessoa;
import app.repositorio.PessoaDAOImpl;

public class App {

    public static void main(String [] args) {
        executar();
    }

    public static void executar() {

        Pessoa p1 = new Pessoa(1, "Guilherme", "Aguiar");
        Pessoa p2 = new Pessoa(2, "Fulano", "Costa");
        Pessoa p3 = new Pessoa(3, "Ciclano", "Silva");
        Pessoa p4 = new Pessoa(4, "Beltrano", "Oliveira");

        PessoaDAOImpl pDAOImpl = new PessoaDAOImpl();
        pDAOImpl.adicionar(p1);
        pDAOImpl.adicionar(p2);
        pDAOImpl.adicionar(p3);
        pDAOImpl.adicionar(p4);

        Pessoa idPessoa = pDAOImpl.obterPeloId(p4.getId());
        System.out.println("Pessoa buscada pelo Id: " + idPessoa.getNome() + " " + idPessoa.getSobrenome());

        Pessoa idPessoa2 = pDAOImpl.obterPeloId(p3.getId());
        p3.setSobrenome("Gomes");
        pDAOImpl.atualizar(p3);
        System.out.println("Pessoa com sobrenome atualizado: " + idPessoa2.getNome() + " " + idPessoa2.getSobrenome());

        pDAOImpl.deletarPeloId(p2.getId());

    }

}