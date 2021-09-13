package app.repositorio;
import app.entidade.Pessoa;

public interface PessoaDAO {

    void adicionar(Pessoa p);
    void atualizar(Pessoa p);
    void deletarPeloId(int id);
    Pessoa obterPeloId(int id);

}